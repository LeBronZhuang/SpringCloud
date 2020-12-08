package com.qf.controller;

import com.qf.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class ConsumerOrderController {
    @Autowired
    private RestTemplate restTemplate;
    //新增
    @PostMapping("insert")
    public String  insert(Orders orders) {
        System.out.println(orders);
        return restTemplate.postForObject("http://order/insert",orders,String.class);

    }

    //删除
    @GetMapping("delete")
    public String  delOrder(Integer oid) {

        return restTemplate.getForObject("http://order/delete?oid="+oid,String.class);
    }

    //查询订单
    @PostMapping("All")
    public String  selectAll() {
        Orders orders = new Orders();

        return restTemplate.postForObject("http://order/All",orders,String.class);
    }

    //修改数据
    @PostMapping("update")
    public String  updateOrderById(Orders orders) {
       return restTemplate.postForObject("http://order/update",orders,String.class);

    }
}
