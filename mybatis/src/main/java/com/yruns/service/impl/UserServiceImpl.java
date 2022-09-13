package com.yruns.service.impl;

import com.yruns.dao.UserDao;
import com.yruns.pojo.User;
import com.yruns.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public List<User> selectByUsername(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

}
