package com.qf.service.impl;

import com.qf.dao.OrderDao;
import com.qf.pojo.Orders;
import com.qf.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao ordersDao;

    @Override
    public Orders queryById(Integer oid) {
        return this.ordersDao.queryById(oid);
    }

    @Override
    public List<Orders> queryAllByLimit(int offset, int limit) {
        return this.ordersDao.queryAllByLimit(offset, limit);
    }

    @Override
    public Orders insert(Orders orders) {
        this.ordersDao.insert(orders);
        return orders;
    }

    @Override
    public Orders update(Orders orders) {
        this.ordersDao.update(orders);
        return this.queryById(orders.getOid());
    }

    @Override
    public boolean deleteById(Integer oid) {
        return this.ordersDao.deleteById(oid) > 0;
    }

    @Override
    public List<Orders> selectAll() {
        return ordersDao.selectAll();
    }
}
