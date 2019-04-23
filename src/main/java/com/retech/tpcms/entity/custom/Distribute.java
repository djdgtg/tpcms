package com.retech.tpcms.entity.custom;

/**
 * @author qinc
 * @date 2019/4/16
 */
public class Distribute {

    private Integer userId;

    private String codes;

    private Integer auditingStage;//2复审，3终审

    private String deadlineString;

    private String taskDescription;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public Integer getAuditingStage() {
        return auditingStage;
    }

    public void setAuditingStage(Integer auditingStage) {
        this.auditingStage = auditingStage;
    }

    public String getDeadlineString() {
        return deadlineString;
    }

    public void setDeadlineString(String deadlineString) {
        this.deadlineString = deadlineString;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
