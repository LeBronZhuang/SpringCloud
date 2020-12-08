package com.qf.service;

import com.qf.pojo.Qx;

import java.util.List;

public interface QxService {
    List<Qx> getUserPdesc(String username, String password);
}
