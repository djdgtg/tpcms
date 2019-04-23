package com.retech.tpcms.entity;

import java.io.Serializable;

/**
 * Table: t_error
 * Author: qinc
 * Date: 2019-04-18 13:54:20
 */
public class Error implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * Column:    res_id
     * Nullable:  true
     */
    private Integer resId;

    /**
     * Column:    res_type
     * Nullable:  true
     */
    private Integer resType;

    /**
     * Column:    name
     * Nullable:  true
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}