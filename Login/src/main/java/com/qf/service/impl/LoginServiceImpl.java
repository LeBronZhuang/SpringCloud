package com.qf.service.impl;

import com.qf.dao.LoginDao;
import com.qf.pojo.Permission;
import com.qf.pojo.Roles;
import com.qf.pojo.User;
import com.qf.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LoginServiceImpl implements ILoginService {
    @Resource
    private LoginDao loginDao;

    @Override
    public List<User> getAllUsers() {
        return loginDao.getAllUsers();
    }

    @Override
    public List<Roles> getRolesByUsername(String username) {
        return loginDao.getRolesByUsername(username);
    }

    @Override
    public List<Permission> getPermissionByUsername(String username) {
        return loginDao.getPermissionByUsername(username);
    }

    @Override
    public List<Permission> getPermissionByUsername1(String username) {
        return loginDao.getPermissionByUsername1(username);
    }

    @Override
    public User login(String username, String password) {
        return loginDao.login(username,password);
    }
}
