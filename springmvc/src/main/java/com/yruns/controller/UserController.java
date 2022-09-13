package com.yruns.controller;

import com.yruns.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * UserController
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("user test...");
        return "{'module': 'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete...");
        return "{'module': 'springmvc'}";
    }

    /**
     * 接收普通参数
     */
    @RequestMapping("/paramTest")
    @ResponseBody
    public String paramTest(@RequestParam("name")String username, int age) {
        System.out.println(username);
        System.out.println(age);
        return "{'module': 'paramTest'}";
    }

    /**
     * POJO参数
     */
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("POJO参数：" + user);
        return "{'module': 'pojoParam'}";
    }

    /**
     * 嵌套POJO参数
     */
    @RequestMapping("/pojoContainParam")
    @ResponseBody
    public String pojoContainParam(User user) {
        System.out.println("POJO参数：" + user);
        return "{'module': 'pojoContainParam'}";
    }

    /**
     * Array参数
     */
    @RequestMapping("/ArrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("数组参数：" + Arrays.toString(likes));
        return "{'module': 'ArrayParam'}";
    }

    /**
     * 集合参数
     */
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("集合参数：" + likes);
        return "{'module': 'ListParam'}";
    }


    /**
     * 集合参数：Json形式
     */
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("集合参数：" + likes);
        return "{'module': 'listParamForJson'}";
    }

    /**
     * POJO参数：Json形式
     */
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("POJO参数：" + user);
        return "{'module': 'pojoParamForJson'}";
    }

    /**
     * POJO集合参数：Json形式
     */
    @RequestMapping("/pojoListParamForJson")
    @ResponseBody
    public String pojoListParamForJson(@RequestBody List<User> users) {
        System.out.println("POJOList参数：" + users);
        return "{'module': 'pojoListParamForJson'}";
    }

    /**
     * 日期参数
     */
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
        System.out.println("日期参数：" + date);
        return "{'module': 'dateParam'}";
    }
}
