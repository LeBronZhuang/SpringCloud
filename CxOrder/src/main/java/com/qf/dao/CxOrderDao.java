package com.qf.dao;

import com.qf.pojo.ChaXOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CxOrderDao {
    List<ChaXOrder> cxOrderByOid();
    ChaXOrder cxAllOrder(int oid);
}
