package com.qf.service.impl;

import com.qf.dao.KcunDao;
import com.qf.pojo.Kcun;
import com.qf.service.KcunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class KcunServiceImpl  implements KcunService {

    @Autowired
    private KcunDao KcunDao;
    @Override
    public Kcun selectCar(int kid) {
        return KcunDao.selectCar(kid);
    }

    @Override
    public Kcun insertCar(Kcun kcun) {
        KcunDao.insertCar(kcun);
        return kcun;
    }

    @Override
    public Kcun updateCar(Kcun kcun) {
        KcunDao.updateCar(kcun);
        return kcun;
    }

    @Override
    public boolean deleteCar(int kid) {

        return KcunDao.deleteCar(kid)>0;
    }

    @Override
    public List<Kcun> selectAll() {
        return KcunDao.selectAll();
    }

    @Override
    public Kcun selectCarname(String carname) {
        return KcunDao.selectCarname(carname);
    }
}
