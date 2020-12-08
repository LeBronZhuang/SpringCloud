package com.qf.controller;


import com.qf.pojo.Kcun;
import com.qf.pojo.Orders;
import com.qf.pojo.User;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Orders selectOne(Integer id) {
        return this.orderService.queryById(id);
    }

    //新增
    @PostMapping("insert")
    public HashMap insert(@RequestBody Orders orders) {
        System.out.println(orders);
        HashMap<String, Object> map = new HashMap<>();
//        System.out.println(orders);
//        System.out.println(orders.getUsername());
        User user = restTemplate.postForObject("http://user/getUsername",orders,User.class);
        System.out.println(user);
//       User user = userService.getUsername(orders.getUsername());
        if (user != null) {
//          System.out.println(user.getUid());
            Kcun kcun= restTemplate.postForObject("http://kcun/getCarname",orders,Kcun.class);
//            Kcun kcun = kCunService.selectCarname(orders.getCarname());
//          Integer num1= kcun.getCarnumber();
//          System.out.println(orders.getNumber());
//            if (kcun !=null){
                  if ((kcun.getCarnumber() - orders.getNumber()) >= 0) {
                  orders.setUid(user.getUid());
                  orderService.insert(orders);
                  kcun.setCarnumber((kcun.getCarnumber() - orders.getNumber()));
                  restTemplate.postForObject("http://kcun/update", kcun, String.class);
//                kCunService.updateCar(kcun);
//            }

            } else {
                map.put("code", 3);
                map.put("data", kcun.getCarnumber());
                return map;
            }
        } else {
            map.put("code", 0);
            return map;
        }


        return null;
    }

    //删除
    @GetMapping("delete")
    public boolean delOrder(Integer oid) {
        orderService.deleteById(oid);
        return true;
    }

    //查询订单
    @PostMapping("All")

    public List<Orders> selectAll() {
        List<Orders> orders = orderService.selectAll();

        return orders;
    }

    //修改数据
    @PostMapping("update")
    public HashMap updateOrderById(@RequestBody Orders orders) {
        HashMap<String , Object> map = new HashMap<>();
        Kcun kcun= restTemplate.postForObject("http://kcun/getCarname",orders,Kcun.class);
        if (kcun==null){
            map.put("code",0);
            return map;
        }else {
            map.put("code",1);
            orderService.update(orders);
            return map;
        }

    }
}
