package com.qf.dao;

import com.qf.pojo.Qx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface QxDao {
    List<Qx> getUserPdesc(String username, String password);
}
