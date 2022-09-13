package com.yruns.controller;

import com.yruns.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * NewUserController
 */
@Controller
//@RequestMapping("/newUser")
public class NewUserController {

    /**
     * 跳转页面
     */
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "page.jsp";
    }

    /**
     * 响应文本数据
     */
    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("响应纯文本");
        return "response text";
    }

    /**
     * 响应POJO对象
     */
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo() {
        System.out.println("响应JsonPojo");
        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);
        return user;
    }

    /**
     * 响应POJO集合
     */
    @RequestMapping("/toJsonPojoList")
    @ResponseBody
    public List<User> toJsonPojoList() {
        System.out.println("响应JsonPojo 集合");
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(18);

        User user2 = new User();
        user2.setName("lisi");
        user2.setAge(19);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        return users;
    }

}
