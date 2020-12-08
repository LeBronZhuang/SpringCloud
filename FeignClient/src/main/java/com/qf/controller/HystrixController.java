package com.qf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {


    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "abc")
    public String hello(){
        System.out.println(1/0);
        return "word";
    }
    public String abc(){
        return "我错了";
    }
}
