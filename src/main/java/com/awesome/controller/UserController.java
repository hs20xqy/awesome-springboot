package com.awesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hs on 2017/4/6.
 */
@Controller
@RequestMapping("/user/{name}")
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello user";
    }
}
