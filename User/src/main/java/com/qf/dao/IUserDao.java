package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IUserDao {

    List<User> getAllUser();
    User queryById(int uid);
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
    List<User> queryAll(User user);
    int insert(User user);
    int insertBatch(@Param("entities") List<User> entities);
    int insertOrUpdateBatch(@Param("entities") List<User> entities);
    int update(User user);
    int deleteById(int uid);
    List<User> selectAllUser();
    User getUsername(String username);
}
