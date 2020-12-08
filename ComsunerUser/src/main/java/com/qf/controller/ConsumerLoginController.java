package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@RestController
@RequestMapping("login")
public class ConsumerLoginController {


   @Autowired
   private RestTemplate restTemplate;



    @GetMapping("/users")
    public String getAllUsers(){
        return restTemplate.getForObject("http://login/users",String.class);
    }


    @PostMapping("loginUser")
    public String login(String username,String password){
        System.out.println(username);
        HashMap<String, String > map = new HashMap<>();

        map.put("username",username);
        map.put("password",password);
        System.out.println(map);
        return restTemplate.postForObject("http://login/loginUser",map,String.class);
    }

}
