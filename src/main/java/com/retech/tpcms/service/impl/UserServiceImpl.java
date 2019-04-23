package com.retech.tpcms.service.impl;

import com.retech.tpcms.entity.User;
import com.retech.tpcms.entity.UserExample;
import com.retech.tpcms.mapper.UserMapper;
import com.retech.tpcms.service.UserService;
import com.retech.tpcms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qinc
 * @date 2019/4/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLogin(User user) {
        UserExample example=new UserExample();
        example.createCriteria()
                .andLoginNameEqualTo(user.getLoginName())
                .andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if(users!=null&&users.size()>0){
            return users.get(0);
        }
        return null;
    }
}
