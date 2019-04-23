package com.retech.tpcms.service;

import com.retech.tpcms.entity.Error;
import com.retech.tpcms.utils.InterfaceResult;

public interface ErrorService {
    InterfaceResult add(Error error);
}
