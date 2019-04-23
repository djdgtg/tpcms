package com.retech.tpcms.controller;

import com.alibaba.fastjson.JSON;
import com.retech.tpcms.aspect.LogAnnotation;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.Log;
import com.retech.tpcms.entity.User;
import com.retech.tpcms.service.UserService;
import com.retech.tpcms.utils.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * @author qinc
 * @date 2019/4/9
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${interface.url.login}")
    private String LOGIN_URL;

    @Value("${interface.url.log}")
    private String LOG_URL;

    @Value("${interface.sign.key}")
    private String KEY;

    @Autowired
    private UserService userService;

    @Autowired
    private HttpClientUtil httpClientUtil;

    @GetMapping("/login")
    /**
     *@description 用户登录
     *@params [user, request]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "用户", optType = LogAspect.LOG_TYPE_LOGIN, content = "用户登录")
    public ActionResult login(User user, HttpServletRequest request) {
        ActionResult actionResult = httpClientUtil.sendPostRequest(LOGIN_URL,user,ActionResult.class);
        Map data = (Map) actionResult.getData();
        try {
            User loginUser=new User();
            BeanUtils.populate(loginUser, data);
            request.getSession().setAttribute("LOGIN_SESSION", loginUser);
            return ActionResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ActionResult.build(-1, "账号或者密码错误！");
    }

    @PostMapping("/checkLogin")
    /**
     *@description 模拟用户登录校验返回用户完整信息
     *@params [user, key, sign]
     *@return ActionResult
     */
    public ActionResult checkLogin(@RequestBody RequestObject object) {
        if (httpClientUtil.checkRequestMd5(object)) {
            User user = JSON.parseObject(DESUtil.decryptString(object.getParams()), User.class);
            return ActionResult.ok(userService.getUserByLogin(user));
        }
        return ActionResult.build(400, "错误的请求参数！");
    }

    @RequestMapping("/logout")
    /**
     *@description 用户登出
     *@params [request]
     *@return ActionResult
     */
    public ActionResult Logout(HttpServletRequest request) {
        //避免无法在session中获取user信息,登出日志记录单独记录
        User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
        Log log = new Log();
        log.setType("web");
        log.setOptType(LogAspect.LOG_TYPE_OTHER);
        log.setModuleName("用户");
        log.setLoginName(user.getLoginName());
        log.setIp(httpClientUtil.getRequestIp(request));
        log.setContent("用户退出登录");
        log.setUserName(user.getUserName());
        log.setCreateTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        httpClientUtil.sendPostRequest(LOG_URL,log,InterfaceResult.class);
        request.getSession().invalidate();
        return ActionResult.ok();
    }
}
