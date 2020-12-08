package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("user")
public class ConsumerUserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAllUser")
    public String getAllUser(){
        return restTemplate.getForObject("http://user/AllUser",String.class);
    }
    @GetMapping("selectOne")
    public String selectOne( int id) {
        return restTemplate.getForObject("http://user/selectOne?id="+id,String.class);
    }
    //新增用户
    @PostMapping("insertUser")
    public String insertUser(User user){
        System.out.println(user);
        return restTemplate.postForObject("http://user/insert",user,String.class);

    }
    //删除客户
    @GetMapping("del")
    public String  delUserById( int uid){
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(uid);
        System.out.println("5209620520");
         map.put("uid", uid);
        return restTemplate.postForObject("http://user/delete",map,String.class);
    }
    //修改客户
    @PostMapping("update")
    public String updateUser(User user){
        System.out.println(user);
        return restTemplate.postForObject("http://user/update",user,String.class);
    }
    //查询用户
    @PostMapping("selectAlluser")
    public String   selectAllUser(){
        User user = new User();
        
        return restTemplate.postForObject("http://user/selectAlluser",user,String.class);
    }
}
