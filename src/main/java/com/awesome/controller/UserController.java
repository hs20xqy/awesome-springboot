package com.awesome.controller;

import com.awesome.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hs on 2017/4/6.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/get/{userId}")
    @ResponseBody
    public String getUser(@PathVariable Integer userId) {
        return userService.getUserById(userId).getUserName();
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }


}
