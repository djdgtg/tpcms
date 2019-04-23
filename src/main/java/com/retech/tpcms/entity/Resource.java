package com.retech.tpcms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Table: t_resource
 * Author: qinc
 * Date: 2019-04-16 16:11:48
 */
public class Resource implements Serializable {
    /**
     * 资源编号
     * Column:    code
     * Nullable:  false
     */
    private Integer code;

    /**
     * 来源机构id
     * Column:    org_id
     * Nullable:  true
     */
    private Integer orgId;

    /**
     * 文件大小
     * Column:    resource_size
     * Nullable:  true
     */
    private Long resourceSize;

    /**
     * 教材格式
     * Column:    format
     * Nullable:  true
     */
    private String format;

    /**
     * 资源路径
     * Column:    preview_url
     * Nullable:  true
     */
    private String previewUrl;

    /**
     * 上传状态:0上传失败，1上传成功
     * Column:    upload_status
     * Nullable:  true
     */
    private Integer uploadStatus;

    /**
     * 资源名称
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 入库人
     * Column:    in_by
     * Nullable:  true
     */
    private Integer inBy;

    /**
     * 入库时间
     * Column:    in_date
     * Nullable:  true
     */
    private Date inDate;

    /**
     * 资源大类
     * Column:    res_type
     * Nullable:  true
     */
    private Integer resType;

    /**
     * 分类id
     * Column:    kind
     * Nullable:  true
     */
    private Integer kind;

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
     * 年级
     * Column:    class_code
     * Nullable:  true
     */
    private Integer classCode;

    /**
     * 册别
     * Column:    book_code
     * Nullable:  true
     */
    private Integer bookCode;

    /**
     * 出版社
     * Column:    publishing
     * Nullable:  true
     */
    private Integer publishing;

    /**
     * CP价格
     * Column:    cp_price
     * Nullable:  true
     */
    private Float cpPrice;

    /**
     * B2B价格
     * Column:    b2b_price
     * Nullable:  true
     */
    private Float b2bPrice;

    /**
     * B2C价格
     * Column:    b2c_price
     * Nullable:  true
     */
    private Float b2cPrice;

    /**
     * 封面
     * Column:    cover
     * Nullable:  true
     */
    private String cover;

    /**
     * 提交状态：0未提交，1已提交
     * Column:    submit_status
     * Nullable:  true
     */
    private Integer submitStatus;

    /**
     * 审核状态:1初审过，-1初审未过，2复审过，-2复审未过，3终审过，-3终审未过
     * Column:    approval_status
     * Nullable:  true
     */
    private String approvalStatus;

    /**
     * 资源状态：0初始化，1审核中，2审核通过，3审核未通过
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 标引人
     * Column:    indexer_id
     * Nullable:  true
     */
    private Integer indexerId;

    /**
     * 标引时间
     * Column:    index_time
     * Nullable:  true
     */
    private Date indexTime;

    /**
     * 初审人
     * Column:    first_user_id
     * Nullable:  true
     */
    private Integer firstUserId;

    /**
     * 是否已经分配复审：1是，0否
     * Column:    second_distribute_true
     * Nullable:  true
     */
    private Integer secondDistributeTrue;

    /**
     * 复审人
     * Column:    second_user_id
     * Nullable:  true
     */
    private Integer secondUserId;

    /**
     * 复审截止日期
     * Column:    second_deadline
     * Nullable:  true
     */
    private Date secondDeadline;

    /**
     * 复审分配时间
     * Column:    second_distribute_time
     * Nullable:  true
     */
    private Date secondDistributeTime;

    /**
     * 复审分配人
     * Column:    second_distributor
     * Nullable:  true
     */
    private Integer secondDistributor;

    /**
     * 是否已经分配终审：1是，0否
     * Column:    final_distribute_true
     * Nullable:  true
     */
    private Integer finalDistributeTrue;

    /**
     * 终审人
     * Column:    final_user_id
     * Nullable:  true
     */
    private Integer finalUserId;

    /**
     * 终止截止日期
     * Column:    final_deadline
     * Nullable:  true
     */
    private Date finalDeadline;

    /**
     * 终审分配时间
     * Column:    final_distribute_time
     * Nullable:  true
     */
    private Date finalDistributeTime;

    /**
     * 终审分配人
     * Column:    final_distributor
     * Nullable:  true
     */
    private Integer finalDistributor;

    private static final long serialVersionUID = 1L;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Long getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Long resourceSize) {
        this.resourceSize = resourceSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl == null ? null : previewUrl.trim();
    }

    public Integer getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(Integer uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getInBy() {
        return inBy;
    }

    public void setInBy(Integer inBy) {
        this.inBy = inBy;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
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

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCode(Integer classCode) {
        this.classCode = classCode;
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    public Integer getPublishing() {
        return publishing;
    }

    public void setPublishing(Integer publishing) {
        this.publishing = publishing;
    }

    public Float getCpPrice() {
        return cpPrice;
    }

    public void setCpPrice(Float cpPrice) {
        this.cpPrice = cpPrice;
    }

    public Float getB2bPrice() {
        return b2bPrice;
    }

    public void setB2bPrice(Float b2bPrice) {
        this.b2bPrice = b2bPrice;
    }

    public Float getB2cPrice() {
        return b2cPrice;
    }

    public void setB2cPrice(Float b2cPrice) {
        this.b2cPrice = b2cPrice;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getSubmitStatus() {
        return submitStatus;
    }

    public void setSubmitStatus(Integer submitStatus) {
        this.submitStatus = submitStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIndexerId() {
        return indexerId;
    }

    public void setIndexerId(Integer indexerId) {
        this.indexerId = indexerId;
    }

    public Date getIndexTime() {
        return indexTime;
    }

    public void setIndexTime(Date indexTime) {
        this.indexTime = indexTime;
    }

    public Integer getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Integer firstUserId) {
        this.firstUserId = firstUserId;
    }

    public Integer getSecondDistributeTrue() {
        return secondDistributeTrue;
    }

    public void setSecondDistributeTrue(Integer secondDistributeTrue) {
        this.secondDistributeTrue = secondDistributeTrue;
    }

    public Integer getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Integer secondUserId) {
        this.secondUserId = secondUserId;
    }

    public Date getSecondDeadline() {
        return secondDeadline;
    }

    public void setSecondDeadline(Date secondDeadline) {
        this.secondDeadline = secondDeadline;
    }

    public Date getSecondDistributeTime() {
        return secondDistributeTime;
    }

    public void setSecondDistributeTime(Date secondDistributeTime) {
        this.secondDistributeTime = secondDistributeTime;
    }

    public Integer getSecondDistributor() {
        return secondDistributor;
    }

    public void setSecondDistributor(Integer secondDistributor) {
        this.secondDistributor = secondDistributor;
    }

    public Integer getFinalDistributeTrue() {
        return finalDistributeTrue;
    }

    public void setFinalDistributeTrue(Integer finalDistributeTrue) {
        this.finalDistributeTrue = finalDistributeTrue;
    }

    public Integer getFinalUserId() {
        return finalUserId;
    }

    public void setFinalUserId(Integer finalUserId) {
        this.finalUserId = finalUserId;
    }

    public Date getFinalDeadline() {
        return finalDeadline;
    }

    public void setFinalDeadline(Date finalDeadline) {
        this.finalDeadline = finalDeadline;
    }

    public Date getFinalDistributeTime() {
        return finalDistributeTime;
    }

    public void setFinalDistributeTime(Date finalDistributeTime) {
        this.finalDistributeTime = finalDistributeTime;
    }

    public Integer getFinalDistributor() {
        return finalDistributor;
    }

    public void setFinalDistributor(Integer finalDistributor) {
        this.finalDistributor = finalDistributor;
    }
}