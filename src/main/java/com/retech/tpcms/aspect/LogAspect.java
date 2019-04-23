package com.retech.tpcms.aspect;

import com.retech.tpcms.entity.Log;
import com.retech.tpcms.entity.User;
import com.retech.tpcms.utils.HttpClientUtil;
import com.retech.tpcms.utils.InterfaceResult;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
@Aspect
@Component
public class LogAspect {


    @Value("${interface.sign.key}")
    private String KEY;

    @Value("${interface.url.log}")
    private String LOG_URL;

    public static final String LOG_TYPE_LOGIN = "LOGIN";

    public static final String LOG_TYPE_ADD = "ADD";

    public static final String LOG_TYPE_UPDATE = "UPDATE";

    public static final String LOG_TYPE_DELETE = "DELETE";

    public static final String LOG_TYPE_SELECT = "SELECT";

    public static final String LOG_TYPE_OTHER = "OTHER";

    @Autowired
    private HttpServletRequest request; //自动注入request

    @Autowired
    private HttpClientUtil httpClientUtil;

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(com.retech.tpcms.aspect.LogAnnotation)")
    public void actionAspect() {
    }

    @AfterReturning("actionAspect() && @annotation(logAnnotation)")
    public void afterReturn(LogAnnotation logAnnotation) {
        try {
            User loginUser = (User) request.getSession().getAttribute("LOGIN_SESSION");
            String optType = logAnnotation.optType();
            String moduleName = logAnnotation.moduleName();
            String content = logAnnotation.content();
            if (loginUser != null) {
                User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
                Log log=new Log();
                log.setType("web");
                log.setOptType(optType);
                log.setModuleName(moduleName);
                log.setLoginName(user.getLoginName());
                log.setIp(httpClientUtil.getRequestIp(request));
                log.setContent(content);
                log.setUserName(user.getUserName());
                log.setCreateTime(DateFormatUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss"));
                InterfaceResult result = httpClientUtil.sendPostRequest(LOG_URL, log, InterfaceResult.class);
                if(result!=null&&result.getResult().equals("0")){
                   logger.info("添加日志信息成功");
                }
            }
        } catch (Exception e) {
            logger.error("后置通知异常:{}", e.getMessage());
            e.printStackTrace();
        }
    }

}
