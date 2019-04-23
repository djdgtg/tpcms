package com.retech.tpcms.service;

import com.retech.tpcms.entity.User;
import com.retech.tpcms.utils.ActionResult;

public interface UserService {

    User getUserByLogin(User user);
}
