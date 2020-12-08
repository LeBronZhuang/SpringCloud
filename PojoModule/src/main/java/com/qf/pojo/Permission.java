package com.qf.pojo;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2020-11-13 10:27:57
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 747386414269750173L;

    private Integer pid;

    private String pname;

    private String pdesc;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

}