package com.qf.controller;

import com.qf.pojo.ChaXOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("chaxorders")
public class ConsumerCxOrderController {
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("cx")
    public String  chaXOrders(){
        ChaXOrder chaXOrder = new ChaXOrder();
        return restTemplate.postForObject("http://cxorder/cx",chaXOrder,String.class);
    }
    @GetMapping("cxOrderAll")
    public String cxOrderAll(int oid){
        System.out.println(oid);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("oid",oid);

        System.out.println(map.get("oid"));

        return restTemplate.postForObject("http://cxorder/cxOrderAll?oid="+oid,map,String.class);
    }
}
