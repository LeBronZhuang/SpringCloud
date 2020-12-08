package com.qf.service.impl;

import com.qf.dao.QxDao;
import com.qf.pojo.Qx;
import com.qf.service.QxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class QxServiceImpl implements QxService {

    @Autowired
    private QxDao qxDao;
    @Override
    public List<Qx> getUserPdesc(String username, String password) {
        return qxDao.getUserPdesc(username, password);
    }
}
