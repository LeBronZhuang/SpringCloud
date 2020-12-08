package com.qf.controller;

import com.qf.pojo.Orders;
import com.qf.pojo.User;
import com.qf.server.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserServer iUserServer;
    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return iUserServer.getAllUser();
    }
    @GetMapping("selectOne")
    public User selectOne(int id) {
        return this.iUserServer.queryById(id);
    }
    //新增用户
    @PostMapping("insert")
    public User insertUser(@RequestBody User user){
        System.out.println(user);
        return iUserServer.insert(user);

    }
    //删除客户
    @PostMapping("delete")
    public boolean delUserById(@RequestBody Map map){
        int uid = (Integer) map.get("uid");
        iUserServer.deleteById(uid);
        return true;
    }
    //修改客户
    @PostMapping("update")
    public User updateUser(@RequestBody User user){

        return iUserServer.update(user);
    }
    //查询用户
    @PostMapping("selectAlluser")
    public List<User> selectAllUser(){
        List<User> users = iUserServer.selectAllUser();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
    @PostMapping("getUsername")
    public User getUsername(@RequestBody Orders orders){
        System.out.println(orders);

        return iUserServer.getUsername(orders.getUsername());
    }
}
