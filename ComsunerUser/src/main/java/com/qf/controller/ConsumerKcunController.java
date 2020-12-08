package com.qf.controller;

import com.qf.pojo.Kcun;
import com.qf.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("kcun")
public class ConsumerKcunController {
    @Autowired
    private RestTemplate restTemplate;
//    库存查询
    @PostMapping("kcorders")
    public String selectCar(int kid){
        System.out.println(kid);
        return restTemplate.getForObject("http://kcun/kcorders?kid="+kid,String.class);
    }
//    //出库
    @GetMapping("del")
    public String  delKcun(int kid){

        return restTemplate.getForObject("http://kcun/del?kid="+kid,String.class);
    }
    //入库
    @PostMapping("insert")
    public String  insertKcun(Kcun kcun){
        System.out.println(kcun);
        return restTemplate.postForObject("http://kcun/insert",kcun,String.class);

    }
//    //库存修改
    @PostMapping("update")
    public String  updateKcun( Kcun kcun){
        System.out.println(kcun);
        return restTemplate.postForObject("http://kcun/update",kcun,String.class);
    }
//    //查询所有
    @PostMapping("selectAll")
    public String selectAll(){
        Kcun kcun = new Kcun();
        return restTemplate.postForObject("http://kcun/selectAll",kcun,String.class);
    }
    @PostMapping("getCarname")
    public String getCarname( Orders orders){
        System.out.println(orders.getCarname());
        return restTemplate.postForObject("http://kcun/getCarname",orders,String.class);
    }
}
