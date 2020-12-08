package com.qf.controller;

import com.qf.pojo.Qx;
import com.qf.service.QxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class QxController {
    @Autowired
    private QxService qxService;
    @PostMapping("getQx")
    public List<Qx> getQx(@RequestBody Map map){
        System.out.println(map);
        String  username = (String) map.get("username");
        String  password = (String) map.get("password");
        return qxService.getUserPdesc(username,password);
    }
}
