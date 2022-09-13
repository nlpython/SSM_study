package com.yruns.service;

import com.yruns.config.SpringConfig;
import com.yruns.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserServiceTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectAll() {
        System.out.println(userService.selectAll());
    }

    @Test
    public void testSelectByUsername() {
        System.out.println(userService.selectByUsername("ysh"));
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("abc");
        user.setPassword("786");
        userService.insert(user);
    }

}
