package com.qf.pojo;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2020-11-13 10:28:00
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 581231671677837974L;

    private Integer uid;

    private Integer rid;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

}