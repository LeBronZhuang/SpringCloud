package com.qf.dao;

import com.qf.pojo.Permission;
import com.qf.pojo.Roles;
import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface LoginDao {
    List<User> getAllUsers();
    List<Roles> getRolesByUsername(String username);
    List <Permission> getPermissionByUsername(String username);
    List <Permission> getPermissionByUsername1(String username);
    User login(@Param("username") String username, @Param("password") String password);
}
