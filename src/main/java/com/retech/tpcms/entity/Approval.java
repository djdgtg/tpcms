package com.retech.tpcms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Table: t_approval
 * Author: qinc
 * Date: 2019-04-16 16:11:48
 */
public class Approval implements Serializable {
    /**
     * 主键
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * Column:    org_id
     * Nullable:  true
     */
    private Integer orgId;

    /**
     * 资源大类
     * Column:    res_type
     * Nullable:  true
     */
    private Integer resType;

    /**
     * 资源编号
     * Column:    code
     * Nullable:  true
     */
    private Integer code;

    /**
     * 审核人
     * Column:    user_id
     * Nullable:  true
     */
    private Integer userId;

    /**
     * 审核阶段：1初审，2复审，3终审
     * Column:    approval_node
     * Nullable:  true
     */
    private Integer approvalNode;

    /**
     * 审核结果：0,待审核，1审核通过，2审核未通过
     * Column:    approval_status
     * Nullable:  true
     */
    private Integer approvalStatus;

    /**
     * 审核时间
     * Column:    edit_time
     * Nullable:  true
     */
    private Date editTime;

    /**
     * 审核意见
     * Column:    suggestion
     * Nullable:  true
     */
    private String suggestion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApprovalNode() {
        return approvalNode;
    }

    public void setApprovalNode(Integer approvalNode) {
        this.approvalNode = approvalNode;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }
}