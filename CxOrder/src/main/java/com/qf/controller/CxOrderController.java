package com.qf.controller;

import com.qf.pojo.ChaXOrder;
import com.qf.service.CxOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class CxOrderController {
   @Autowired
   private CxOrderService cxOrderService;
    @PostMapping("cx")
    public List<ChaXOrder> chaXOrders(){
        return cxOrderService.cxOrderByOid();
    }
    @PostMapping("cxOrderAll")
    public ChaXOrder cxOrderAll(@RequestBody Map map){
         int oid = (Integer) map.get("oid");
        System.out.println(oid);
        return cxOrderService.cxAllOrder(oid);
    }
}
