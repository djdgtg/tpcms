package com.retech.tpcms.entity;

import java.io.Serializable;

/**
 * Table: t_user
 * Author: qinc
 * Date: 2019-04-17 10:47:28
 */
public class User implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * 用户类型：0后台用户、1机构用户
     * Column:    type
     * Nullable:  true
     */
    private Integer type;

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
     * 密码
     * Column:    password
     * Nullable:  true
     */
    private String password;

    /**
     * 手机号
     * Column:    tel
     * Nullable:  true
     */
    private String tel;

    /**
     * 邮箱
     * Column:    email
     * Nullable:  true
     */
    private String email;

    /**
     * 用户级别：0一般用户/1管理员
     * Column:    grade
     * Nullable:  true
     */
    private Integer grade;

    /**
     * 学科
     * Column:    sub_code
     * Nullable:  true
     */
    private Integer subCode;

    /**
     * 学段
     * Column:    stage_code
     * Nullable:  true
     */
    private Integer stageCode;

    /**
     * 部门名称
     * Column:    dept_name
     * Nullable:  true
     */
    private String deptName;

    /**
     * 性别：1男、0女
     * Column:    sex
     * Nullable:  true
     */
    private Integer sex;

    /**
     * 机构id
     * Column:    org_id
     * Nullable:  true
     */
    private Integer orgId;

    /**
     * 机构名
     * Column:    org_name
     * Nullable:  true
     */
    private String orgName;

    /**
     * 备注
     * Column:    remark
     * Nullable:  true
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getSubCode() {
        return subCode;
    }

    public void setSubCode(Integer subCode) {
        this.subCode = subCode;
    }

    public Integer getStageCode() {
        return stageCode;
    }

    public void setStageCode(Integer stageCode) {
        this.stageCode = stageCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}