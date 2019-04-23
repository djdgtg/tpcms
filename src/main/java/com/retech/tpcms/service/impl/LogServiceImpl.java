package com.retech.tpcms.service.impl;

import com.retech.tpcms.entity.Log;
import com.retech.tpcms.mapper.LogMapper;
import com.retech.tpcms.service.LogService;
import com.retech.tpcms.utils.InterfaceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinc
 * @date 2019/4/17
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public InterfaceResult add(Log log) {
        int insert = logMapper.insert(log);
        if(insert>0){
            return InterfaceResult.ok(log);
        }
        return InterfaceResult.error();
    }
}

