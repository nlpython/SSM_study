package com.yruns.service;

import com.yruns.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface UserService {

    List<User> selectAll();

    List<User> selectByUsername(String username);

    @Transactional(rollbackFor = IOException.class) // 遇到如下异常回滚
    void insert(User user);
}
