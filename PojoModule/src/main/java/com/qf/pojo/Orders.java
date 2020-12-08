package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2020-11-13 10:27:55
 */
@Data
public class Orders implements Serializable {
    private static final long serialVersionUID = 185660302103546895L;

    private Integer uid;

    private Integer oid;

    private String carname;

    private String price;

    private Integer number;
    private String Username;




}