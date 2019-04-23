package com.retech.tpcms.service.impl;

import com.retech.tpcms.entity.Error;
import com.retech.tpcms.mapper.ErrorMapper;
import com.retech.tpcms.service.ErrorService;
import com.retech.tpcms.utils.InterfaceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinc
 * @date 2019/4/18
 */
@Service
public class ErrorServiceImpl implements ErrorService {

    @Autowired
    private ErrorMapper errorMapper;

    @Override
    public InterfaceResult add(Error error) {
        int count=errorMapper.insert(error);
        if(count>0){
            InterfaceResult.ok(error);
        }
        return InterfaceResult.error();
    }
}
