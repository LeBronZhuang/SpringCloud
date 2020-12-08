package com.qf.dao;

import com.qf.pojo.Kcun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface KcunDao {
    Kcun selectCar(int kid);
    int insertCar(Kcun kcun);
    int updateCar(Kcun kcun);
    int deleteCar(int kid);
    List<Kcun> selectAll();
    Kcun selectCarname(String carname);
}
