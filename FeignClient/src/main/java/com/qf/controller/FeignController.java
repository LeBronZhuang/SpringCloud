package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    @Autowired
    private FeignInsterface feignInsterface;

    @RequestMapping(value = "/feignGet",method = RequestMethod.GET)
    public String get(@RequestParam(value = "name") String name){
        
        System.out.println(name);
        return feignInsterface.get(name);
    }
}
