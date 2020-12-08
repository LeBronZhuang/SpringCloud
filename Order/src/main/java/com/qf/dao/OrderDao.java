package com.qf.dao;

import com.qf.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderDao {
    Orders queryById(Integer oid);

    List<Orders> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Orders> queryAll(Orders orders);

    int insert(Orders orders);

    int insertBatch(@Param("entities") List<Orders> entities);

    int insertOrUpdateBatch(@Param("entities") List<Orders> entities);

    int update(Orders orders);

    int deleteById(Integer oid);
    List<Orders> selectAll();
}
