package com.qf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/get")
    public String hello(@RequestParam(defaultValue = "zhangsan", value = "name") String name){
        return "hello " + name + ", i am from " + port;
    }
}
