package com.retech.tpcms.entity;

import java.io.Serializable;

/**
 * Table: t_log
 * Author: qinc
 * Date: 2019-04-17 16:55:33
 */
public class Log implements Serializable {
    /**
     * 主键
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 平台标识
     * Column:    type
     * Nullable:  true
     */
    private String type;

    /**
     * 用户名
     * Column:    user_name
     * Nullable:  true
     */
    private String userName;

    /**
     * 登录名
     * Column:    login_name
     * Nullable:  true
     */
    private String loginName;

    /**
     * 所属模块
     * Column:    module_name
     * Nullable:  true
     */
    private String moduleName;

    /**
     * 是否为字典类型：1是，0否
     * Column:    ip
     * Nullable:  true
     */
    private String ip;

    /**
     * Column:    opt_type
     * Nullable:  true
     */
    private String optType;

    /**
     * 操作描述
     * Column:    content
     * Nullable:  true
     */
    private String content;

    /**
     * 操作时间
     * Column:    create_time
     * Nullable:  true
     */
    private String createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}