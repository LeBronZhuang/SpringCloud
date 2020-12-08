package com.qf.service;

import com.qf.pojo.ChaXOrder;

import java.util.List;

public interface CxOrderService {
    List<ChaXOrder> cxOrderByOid();
    ChaXOrder cxAllOrder(int oid);
}
