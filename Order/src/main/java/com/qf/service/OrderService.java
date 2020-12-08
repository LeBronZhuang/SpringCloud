package com.qf.service;

import com.qf.pojo.Orders;

import java.util.List;

public interface OrderService {

    Orders queryById(Integer oid);

    List<Orders> queryAllByLimit(int offset, int limit);

    Orders insert(Orders orders);

    Orders update(Orders orders);

    boolean deleteById(Integer oid);
    List<Orders> selectAll();
}
