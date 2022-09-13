package com.yruns.service.impl;

import com.yruns.pojo.User;
import com.yruns.pojo.User;
import com.yruns.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }

}
