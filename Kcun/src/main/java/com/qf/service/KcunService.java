package com.qf.service;

import com.qf.pojo.Kcun;

import java.util.List;

public interface KcunService {
    Kcun selectCar(int kid);
    Kcun insertCar(Kcun kcun);
    Kcun updateCar(Kcun kcun);
    boolean deleteCar(int kid);
    List<Kcun> selectAll();
    Kcun selectCarname(String carname);
}
