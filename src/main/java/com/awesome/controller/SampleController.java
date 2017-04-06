package com.awesome.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hs on 2017/4/5.
 */
@Controller
public class SampleController {

    @RequestMapping("/{name}")
    @ResponseBody
    String hello(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }
}
