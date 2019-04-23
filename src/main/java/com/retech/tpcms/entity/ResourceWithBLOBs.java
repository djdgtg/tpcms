package com.retech.tpcms.entity;

import java.io.Serializable;

public class ResourceWithBLOBs extends Resource implements Serializable {
    /**
     * 简介
     * Column:    des
     * Nullable:  true
     */
    private String des;

    /**
     * 目录
     * Column:    catalog
     * Nullable:  true
     */
    private String catalog;

    /**
     * 复审任务描述
     * Column:    second_task_description
     * Nullable:  true
     */
    private String secondTaskDescription;

    /**
     * 终审任务描述
     * Column:    final_task_description
     * Nullable:  true
     */
    private String finalTaskDescription;

    /**
     * 元数据信息
     * Column:    metadateInfo
     * Nullable:  true
     */
    private String metadateinfo;

    private static final long serialVersionUID = 1L;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getSecondTaskDescription() {
        return secondTaskDescription;
    }

    public void setSecondTaskDescription(String secondTaskDescription) {
        this.secondTaskDescription = secondTaskDescription == null ? null : secondTaskDescription.trim();
    }

    public String getFinalTaskDescription() {
        return finalTaskDescription;
    }

    public void setFinalTaskDescription(String finalTaskDescription) {
        this.finalTaskDescription = finalTaskDescription == null ? null : finalTaskDescription.trim();
    }

    public String getMetadateinfo() {
        return metadateinfo;
    }

    public void setMetadateinfo(String metadateinfo) {
        this.metadateinfo = metadateinfo == null ? null : metadateinfo.trim();
    }
}