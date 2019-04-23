package com.retech.tpcms.controller;

import com.alibaba.fastjson.JSON;
import com.retech.tpcms.aspect.LogAnnotation;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.Error;
import com.retech.tpcms.entity.User;
import com.retech.tpcms.service.ErrorService;
import com.retech.tpcms.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qinc
 * @date 2019/4/18
 */
@RestController
@RequestMapping("/error")
public class ErrorController {

    @Value("${interface.url.error}")
    private String ERROR_URL;

    @Value("${interface.sign.key}")
    private String KEY;

    @Autowired
    private ErrorService errorService;

    @Autowired
    private HttpClientUtil httpClientUtil;

    @PostMapping("/add")
    /**
     *@description 资源纠错
     *@params [error]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材纠错")
    public ActionResult add(Error error){
        InterfaceResult result = httpClientUtil.sendPostRequest(ERROR_URL, error ,InterfaceResult.class);
        if(result!=null&&result.getResult().equals("0")){
            return ActionResult.ok();
        }
        return ActionResult.build(-1,"纠错失败！");
    }

    @PostMapping("/checkAdd")
    public InterfaceResult checkAdd(@RequestBody RequestObject object){
        if(httpClientUtil.checkRequestMd5(object)){
            Error error = JSON.parseObject(DESUtil.decryptString(object.getParams()), Error.class);
            return errorService.add(error);
        }
        return InterfaceResult.errorParam();
    }
}
