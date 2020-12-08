package com.qf.service.impl;

import com.qf.dao.CxOrderDao;
import com.qf.pojo.ChaXOrder;
import com.qf.service.CxOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CxOrderServiceImpl implements CxOrderService {
    @Autowired
    private CxOrderDao cxOrderDao;
    @Override
    public List<ChaXOrder> cxOrderByOid() {
        return cxOrderDao.cxOrderByOid();
    }

    @Override
    public ChaXOrder cxAllOrder(int oid) {
        return cxOrderDao.cxAllOrder(oid);
    }
}
