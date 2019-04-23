package com.retech.tpcms.controller;

import com.alibaba.fastjson.JSON;
import com.retech.tpcms.entity.Log;
import com.retech.tpcms.entity.User;
import com.retech.tpcms.service.LogService;
import com.retech.tpcms.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinc
 * @date 2019/4/17
 */
@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;


    @Autowired
    private HttpClientUtil httpClientUtil;

    @PostMapping("/add")
    /**
     *@description 模拟日志记录
     *@params [log, key, sign]
     *@return InterfaceResult
     */
    public InterfaceResult add(@RequestBody RequestObject object){
        if (httpClientUtil.checkRequestMd5(object)) {
            Log log = JSON.parseObject(DESUtil.decryptString(object.getParams()), Log.class);
            return logService.add(log);
        }
        return InterfaceResult.errorParam();
    }

}
