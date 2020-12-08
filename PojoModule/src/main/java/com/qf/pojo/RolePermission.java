package com.qf.pojo;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2020-11-13 10:27:58
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = 197592743180664284L;

    private Integer rid;

    private Integer pid;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}