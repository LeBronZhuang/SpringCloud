package com.qf.server;

import com.qf.pojo.User;

import java.util.List;

public interface IUserServer {
    List<User> getAllUser();
    User queryById(int  uid);
    List<User> queryAllByLimit(int offset, int limit);
    User insert(User user);
    User update(User user);
    boolean deleteById(int uid);
    List<User> selectAllUser();
    User getUsername(String username);
}
