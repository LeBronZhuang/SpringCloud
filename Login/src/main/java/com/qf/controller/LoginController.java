package com.qf.controller;

import com.qf.pojo.Qx;
import com.qf.pojo.User;
import com.qf.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class LoginController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ILoginService iLoginService;
    /*@Resource
    private QxService qxService;*/



    @GetMapping("/users")
    public List<User> getAllUsers(){

        return iLoginService.getAllUsers();
    }


    @PostMapping("loginUser")
    public HashMap<String,Object> login(@RequestBody Map map){
        System.out.println(map);
       String  username = (String) map.get("username");
       String  password = (String) map.get("password");
        HashMap<String, Object> mapPdesc = new HashMap<>();
        System.out.println(username);
        if(iLoginService.login(username,password)!=null){
            List<Qx> userPdesc =restTemplate.postForObject("http://qx/getQx",map,List.class);
            mapPdesc.put("quanxi",userPdesc);
            System.out.println(mapPdesc);
            return mapPdesc;
        }
        return mapPdesc;
    }
}
