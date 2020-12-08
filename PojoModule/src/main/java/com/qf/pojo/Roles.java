package com.qf.pojo;

import java.io.Serializable;

/**
 * (Roles)实体类
 *
 * @author makejava
 * @since 2020-11-13 10:27:59
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = -73211434501734209L;

    private Integer rid;

    private String rname;

    private String rdesc;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

}