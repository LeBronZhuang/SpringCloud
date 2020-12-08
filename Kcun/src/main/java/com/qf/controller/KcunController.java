package com.qf.controller;

import com.qf.pojo.Kcun;
import com.qf.pojo.Orders;
import com.qf.service.KcunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class KcunController {
    @Resource
    private KcunService kcunService;
    //库存查询
    @GetMapping ("kcorders")
    public Kcun selectCar( int kid){
        return kcunService.selectCar(kid);
    }
    //出库
    @GetMapping("del")
    public boolean delKcun(int kid){
        kcunService.deleteCar(kid);
        return true;
    }
    //入库
    @PostMapping("insert")
    public Kcun insertKcun(@RequestBody Kcun kcun){
        return kcunService.insertCar(kcun);

    }
    //库存修改
    @PostMapping("update")
    public Kcun updateKcun(@RequestBody Kcun kcun){
        System.out.println(kcun);
        return kcunService.updateCar(kcun);
    }
    //查询所有
    @PostMapping("selectAll")
    public List<Kcun> selectAll(){
        List<Kcun> kcuns = kcunService.selectAll();
        return kcuns;
    }
    @PostMapping("getCarname")
    public Kcun getCarname(@RequestBody Orders orders){
        System.out.println(orders.getCarname());
        return kcunService.selectCarname(orders.getCarname());
    }
}
