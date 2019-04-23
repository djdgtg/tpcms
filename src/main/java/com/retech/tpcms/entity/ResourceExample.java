package com.retech.tpcms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limit = -1;

    public ResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    public Integer getLimit() {
        return limit;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andResourceSizeIsNull() {
            addCriterion("resource_size is null");
            return (Criteria) this;
        }

        public Criteria andResourceSizeIsNotNull() {
            addCriterion("resource_size is not null");
            return (Criteria) this;
        }

        public Criteria andResourceSizeEqualTo(Long value) {
            addCriterion("resource_size =", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeNotEqualTo(Long value) {
            addCriterion("resource_size <>", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeGreaterThan(Long value) {
            addCriterion("resource_size >", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_size >=", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeLessThan(Long value) {
            addCriterion("resource_size <", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeLessThanOrEqualTo(Long value) {
            addCriterion("resource_size <=", value, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeIn(List<Long> values) {
            addCriterion("resource_size in", values, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeNotIn(List<Long> values) {
            addCriterion("resource_size not in", values, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeBetween(Long value1, Long value2) {
            addCriterion("resource_size between", value1, value2, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andResourceSizeNotBetween(Long value1, Long value2) {
            addCriterion("resource_size not between", value1, value2, "resourceSize");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIsNull() {
            addCriterion("preview_url is null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIsNotNull() {
            addCriterion("preview_url is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlEqualTo(String value) {
            addCriterion("preview_url =", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotEqualTo(String value) {
            addCriterion("preview_url <>", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThan(String value) {
            addCriterion("preview_url >", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThanOrEqualTo(String value) {
            addCriterion("preview_url >=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThan(String value) {
            addCriterion("preview_url <", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThanOrEqualTo(String value) {
            addCriterion("preview_url <=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLike(String value) {
            addCriterion("preview_url like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotLike(String value) {
            addCriterion("preview_url not like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIn(List<String> values) {
            addCriterion("preview_url in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotIn(List<String> values) {
            addCriterion("preview_url not in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlBetween(String value1, String value2) {
            addCriterion("preview_url between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotBetween(String value1, String value2) {
            addCriterion("preview_url not between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIsNull() {
            addCriterion("upload_status is null");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIsNotNull() {
            addCriterion("upload_status is not null");
            return (Criteria) this;
        }

        public Criteria andUploadStatusEqualTo(Integer value) {
            addCriterion("upload_status =", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotEqualTo(Integer value) {
            addCriterion("upload_status <>", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusGreaterThan(Integer value) {
            addCriterion("upload_status >", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_status >=", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusLessThan(Integer value) {
            addCriterion("upload_status <", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusLessThanOrEqualTo(Integer value) {
            addCriterion("upload_status <=", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIn(List<Integer> values) {
            addCriterion("upload_status in", values, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotIn(List<Integer> values) {
            addCriterion("upload_status not in", values, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusBetween(Integer value1, Integer value2) {
            addCriterion("upload_status between", value1, value2, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_status not between", value1, value2, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInByIsNull() {
            addCriterion("in_by is null");
            return (Criteria) this;
        }

        public Criteria andInByIsNotNull() {
            addCriterion("in_by is not null");
            return (Criteria) this;
        }

        public Criteria andInByEqualTo(Integer value) {
            addCriterion("in_by =", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByNotEqualTo(Integer value) {
            addCriterion("in_by <>", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByGreaterThan(Integer value) {
            addCriterion("in_by >", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_by >=", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByLessThan(Integer value) {
            addCriterion("in_by <", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByLessThanOrEqualTo(Integer value) {
            addCriterion("in_by <=", value, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByIn(List<Integer> values) {
            addCriterion("in_by in", values, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByNotIn(List<Integer> values) {
            addCriterion("in_by not in", values, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByBetween(Integer value1, Integer value2) {
            addCriterion("in_by between", value1, value2, "inBy");
            return (Criteria) this;
        }

        public Criteria andInByNotBetween(Integer value1, Integer value2) {
            addCriterion("in_by not between", value1, value2, "inBy");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Integer value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Integer value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Integer value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Integer value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Integer value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Integer> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Integer> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Integer value1, Integer value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Integer value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Integer value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Integer value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Integer value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Integer value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Integer> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Integer> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Integer value1, Integer value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Integer value1, Integer value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNull() {
            addCriterion("sub_code is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNotNull() {
            addCriterion("sub_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeEqualTo(Integer value) {
            addCriterion("sub_code =", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotEqualTo(Integer value) {
            addCriterion("sub_code <>", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThan(Integer value) {
            addCriterion("sub_code >", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_code >=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThan(Integer value) {
            addCriterion("sub_code <", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThanOrEqualTo(Integer value) {
            addCriterion("sub_code <=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeIn(List<Integer> values) {
            addCriterion("sub_code in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotIn(List<Integer> values) {
            addCriterion("sub_code not in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeBetween(Integer value1, Integer value2) {
            addCriterion("sub_code between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_code not between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeIsNull() {
            addCriterion("stage_code is null");
            return (Criteria) this;
        }

        public Criteria andStageCodeIsNotNull() {
            addCriterion("stage_code is not null");
            return (Criteria) this;
        }

        public Criteria andStageCodeEqualTo(Integer value) {
            addCriterion("stage_code =", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotEqualTo(Integer value) {
            addCriterion("stage_code <>", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeGreaterThan(Integer value) {
            addCriterion("stage_code >", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage_code >=", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeLessThan(Integer value) {
            addCriterion("stage_code <", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeLessThanOrEqualTo(Integer value) {
            addCriterion("stage_code <=", value, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeIn(List<Integer> values) {
            addCriterion("stage_code in", values, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotIn(List<Integer> values) {
            addCriterion("stage_code not in", values, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeBetween(Integer value1, Integer value2) {
            addCriterion("stage_code between", value1, value2, "stageCode");
            return (Criteria) this;
        }

        public Criteria andStageCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("stage_code not between", value1, value2, "stageCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNull() {
            addCriterion("class_code is null");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNotNull() {
            addCriterion("class_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassCodeEqualTo(Integer value) {
            addCriterion("class_code =", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotEqualTo(Integer value) {
            addCriterion("class_code <>", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThan(Integer value) {
            addCriterion("class_code >", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_code >=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThan(Integer value) {
            addCriterion("class_code <", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThanOrEqualTo(Integer value) {
            addCriterion("class_code <=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIn(List<Integer> values) {
            addCriterion("class_code in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotIn(List<Integer> values) {
            addCriterion("class_code not in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeBetween(Integer value1, Integer value2) {
            addCriterion("class_code between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("class_code not between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNull() {
            addCriterion("book_code is null");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNotNull() {
            addCriterion("book_code is not null");
            return (Criteria) this;
        }

        public Criteria andBookCodeEqualTo(Integer value) {
            addCriterion("book_code =", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotEqualTo(Integer value) {
            addCriterion("book_code <>", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThan(Integer value) {
            addCriterion("book_code >", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_code >=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThan(Integer value) {
            addCriterion("book_code <", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThanOrEqualTo(Integer value) {
            addCriterion("book_code <=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeIn(List<Integer> values) {
            addCriterion("book_code in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotIn(List<Integer> values) {
            addCriterion("book_code not in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeBetween(Integer value1, Integer value2) {
            addCriterion("book_code between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("book_code not between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNull() {
            addCriterion("publishing is null");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNotNull() {
            addCriterion("publishing is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingEqualTo(Integer value) {
            addCriterion("publishing =", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotEqualTo(Integer value) {
            addCriterion("publishing <>", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThan(Integer value) {
            addCriterion("publishing >", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThanOrEqualTo(Integer value) {
            addCriterion("publishing >=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThan(Integer value) {
            addCriterion("publishing <", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThanOrEqualTo(Integer value) {
            addCriterion("publishing <=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingIn(List<Integer> values) {
            addCriterion("publishing in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotIn(List<Integer> values) {
            addCriterion("publishing not in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingBetween(Integer value1, Integer value2) {
            addCriterion("publishing between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotBetween(Integer value1, Integer value2) {
            addCriterion("publishing not between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andCpPriceIsNull() {
            addCriterion("cp_price is null");
            return (Criteria) this;
        }

        public Criteria andCpPriceIsNotNull() {
            addCriterion("cp_price is not null");
            return (Criteria) this;
        }

        public Criteria andCpPriceEqualTo(Float value) {
            addCriterion("cp_price =", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotEqualTo(Float value) {
            addCriterion("cp_price <>", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceGreaterThan(Float value) {
            addCriterion("cp_price >", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cp_price >=", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceLessThan(Float value) {
            addCriterion("cp_price <", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceLessThanOrEqualTo(Float value) {
            addCriterion("cp_price <=", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceIn(List<Float> values) {
            addCriterion("cp_price in", values, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotIn(List<Float> values) {
            addCriterion("cp_price not in", values, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceBetween(Float value1, Float value2) {
            addCriterion("cp_price between", value1, value2, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotBetween(Float value1, Float value2) {
            addCriterion("cp_price not between", value1, value2, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceIsNull() {
            addCriterion("b2b_price is null");
            return (Criteria) this;
        }

        public Criteria andB2bPriceIsNotNull() {
            addCriterion("b2b_price is not null");
            return (Criteria) this;
        }

        public Criteria andB2bPriceEqualTo(Float value) {
            addCriterion("b2b_price =", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceNotEqualTo(Float value) {
            addCriterion("b2b_price <>", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceGreaterThan(Float value) {
            addCriterion("b2b_price >", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("b2b_price >=", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceLessThan(Float value) {
            addCriterion("b2b_price <", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceLessThanOrEqualTo(Float value) {
            addCriterion("b2b_price <=", value, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceIn(List<Float> values) {
            addCriterion("b2b_price in", values, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceNotIn(List<Float> values) {
            addCriterion("b2b_price not in", values, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceBetween(Float value1, Float value2) {
            addCriterion("b2b_price between", value1, value2, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2bPriceNotBetween(Float value1, Float value2) {
            addCriterion("b2b_price not between", value1, value2, "b2bPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceIsNull() {
            addCriterion("b2c_price is null");
            return (Criteria) this;
        }

        public Criteria andB2cPriceIsNotNull() {
            addCriterion("b2c_price is not null");
            return (Criteria) this;
        }

        public Criteria andB2cPriceEqualTo(Float value) {
            addCriterion("b2c_price =", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceNotEqualTo(Float value) {
            addCriterion("b2c_price <>", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceGreaterThan(Float value) {
            addCriterion("b2c_price >", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("b2c_price >=", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceLessThan(Float value) {
            addCriterion("b2c_price <", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceLessThanOrEqualTo(Float value) {
            addCriterion("b2c_price <=", value, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceIn(List<Float> values) {
            addCriterion("b2c_price in", values, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceNotIn(List<Float> values) {
            addCriterion("b2c_price not in", values, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceBetween(Float value1, Float value2) {
            addCriterion("b2c_price between", value1, value2, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andB2cPriceNotBetween(Float value1, Float value2) {
            addCriterion("b2c_price not between", value1, value2, "b2cPrice");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusIsNull() {
            addCriterion("submit_status is null");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusIsNotNull() {
            addCriterion("submit_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusEqualTo(Integer value) {
            addCriterion("submit_status =", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusNotEqualTo(Integer value) {
            addCriterion("submit_status <>", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusGreaterThan(Integer value) {
            addCriterion("submit_status >", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit_status >=", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusLessThan(Integer value) {
            addCriterion("submit_status <", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("submit_status <=", value, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusIn(List<Integer> values) {
            addCriterion("submit_status in", values, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusNotIn(List<Integer> values) {
            addCriterion("submit_status not in", values, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusBetween(Integer value1, Integer value2) {
            addCriterion("submit_status between", value1, value2, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("submit_status not between", value1, value2, "submitStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(String value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(String value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(String value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(String value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(String value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLike(String value) {
            addCriterion("approval_status like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotLike(String value) {
            addCriterion("approval_status not like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<String> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<String> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(String value1, String value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(String value1, String value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIndexerIdIsNull() {
            addCriterion("indexer_id is null");
            return (Criteria) this;
        }

        public Criteria andIndexerIdIsNotNull() {
            addCriterion("indexer_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndexerIdEqualTo(Integer value) {
            addCriterion("indexer_id =", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdNotEqualTo(Integer value) {
            addCriterion("indexer_id <>", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdGreaterThan(Integer value) {
            addCriterion("indexer_id >", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("indexer_id >=", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdLessThan(Integer value) {
            addCriterion("indexer_id <", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdLessThanOrEqualTo(Integer value) {
            addCriterion("indexer_id <=", value, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdIn(List<Integer> values) {
            addCriterion("indexer_id in", values, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdNotIn(List<Integer> values) {
            addCriterion("indexer_id not in", values, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdBetween(Integer value1, Integer value2) {
            addCriterion("indexer_id between", value1, value2, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("indexer_id not between", value1, value2, "indexerId");
            return (Criteria) this;
        }

        public Criteria andIndexTimeIsNull() {
            addCriterion("index_time is null");
            return (Criteria) this;
        }

        public Criteria andIndexTimeIsNotNull() {
            addCriterion("index_time is not null");
            return (Criteria) this;
        }

        public Criteria andIndexTimeEqualTo(Date value) {
            addCriterion("index_time =", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeNotEqualTo(Date value) {
            addCriterion("index_time <>", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeGreaterThan(Date value) {
            addCriterion("index_time >", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("index_time >=", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeLessThan(Date value) {
            addCriterion("index_time <", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeLessThanOrEqualTo(Date value) {
            addCriterion("index_time <=", value, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeIn(List<Date> values) {
            addCriterion("index_time in", values, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeNotIn(List<Date> values) {
            addCriterion("index_time not in", values, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeBetween(Date value1, Date value2) {
            addCriterion("index_time between", value1, value2, "indexTime");
            return (Criteria) this;
        }

        public Criteria andIndexTimeNotBetween(Date value1, Date value2) {
            addCriterion("index_time not between", value1, value2, "indexTime");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdIsNull() {
            addCriterion("first_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdIsNotNull() {
            addCriterion("first_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdEqualTo(Integer value) {
            addCriterion("first_user_id =", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotEqualTo(Integer value) {
            addCriterion("first_user_id <>", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdGreaterThan(Integer value) {
            addCriterion("first_user_id >", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_user_id >=", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdLessThan(Integer value) {
            addCriterion("first_user_id <", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_user_id <=", value, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdIn(List<Integer> values) {
            addCriterion("first_user_id in", values, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotIn(List<Integer> values) {
            addCriterion("first_user_id not in", values, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdBetween(Integer value1, Integer value2) {
            addCriterion("first_user_id between", value1, value2, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andFirstUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_user_id not between", value1, value2, "firstUserId");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueIsNull() {
            addCriterion("second_distribute_true is null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueIsNotNull() {
            addCriterion("second_distribute_true is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueEqualTo(Integer value) {
            addCriterion("second_distribute_true =", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueNotEqualTo(Integer value) {
            addCriterion("second_distribute_true <>", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueGreaterThan(Integer value) {
            addCriterion("second_distribute_true >", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_distribute_true >=", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueLessThan(Integer value) {
            addCriterion("second_distribute_true <", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueLessThanOrEqualTo(Integer value) {
            addCriterion("second_distribute_true <=", value, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueIn(List<Integer> values) {
            addCriterion("second_distribute_true in", values, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueNotIn(List<Integer> values) {
            addCriterion("second_distribute_true not in", values, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueBetween(Integer value1, Integer value2) {
            addCriterion("second_distribute_true between", value1, value2, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTrueNotBetween(Integer value1, Integer value2) {
            addCriterion("second_distribute_true not between", value1, value2, "secondDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIsNull() {
            addCriterion("second_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIsNotNull() {
            addCriterion("second_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdEqualTo(Integer value) {
            addCriterion("second_user_id =", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotEqualTo(Integer value) {
            addCriterion("second_user_id <>", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdGreaterThan(Integer value) {
            addCriterion("second_user_id >", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_user_id >=", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdLessThan(Integer value) {
            addCriterion("second_user_id <", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_user_id <=", value, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdIn(List<Integer> values) {
            addCriterion("second_user_id in", values, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotIn(List<Integer> values) {
            addCriterion("second_user_id not in", values, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdBetween(Integer value1, Integer value2) {
            addCriterion("second_user_id between", value1, value2, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_user_id not between", value1, value2, "secondUserId");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineIsNull() {
            addCriterion("second_deadline is null");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineIsNotNull() {
            addCriterion("second_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineEqualTo(Date value) {
            addCriterion("second_deadline =", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineNotEqualTo(Date value) {
            addCriterion("second_deadline <>", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineGreaterThan(Date value) {
            addCriterion("second_deadline >", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("second_deadline >=", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineLessThan(Date value) {
            addCriterion("second_deadline <", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("second_deadline <=", value, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineIn(List<Date> values) {
            addCriterion("second_deadline in", values, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineNotIn(List<Date> values) {
            addCriterion("second_deadline not in", values, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineBetween(Date value1, Date value2) {
            addCriterion("second_deadline between", value1, value2, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("second_deadline not between", value1, value2, "secondDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeIsNull() {
            addCriterion("second_distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeIsNotNull() {
            addCriterion("second_distribute_time is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeEqualTo(Date value) {
            addCriterion("second_distribute_time =", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeNotEqualTo(Date value) {
            addCriterion("second_distribute_time <>", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeGreaterThan(Date value) {
            addCriterion("second_distribute_time >", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("second_distribute_time >=", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeLessThan(Date value) {
            addCriterion("second_distribute_time <", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeLessThanOrEqualTo(Date value) {
            addCriterion("second_distribute_time <=", value, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeIn(List<Date> values) {
            addCriterion("second_distribute_time in", values, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeNotIn(List<Date> values) {
            addCriterion("second_distribute_time not in", values, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeBetween(Date value1, Date value2) {
            addCriterion("second_distribute_time between", value1, value2, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributeTimeNotBetween(Date value1, Date value2) {
            addCriterion("second_distribute_time not between", value1, value2, "secondDistributeTime");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorIsNull() {
            addCriterion("second_distributor is null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorIsNotNull() {
            addCriterion("second_distributor is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorEqualTo(Integer value) {
            addCriterion("second_distributor =", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorNotEqualTo(Integer value) {
            addCriterion("second_distributor <>", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorGreaterThan(Integer value) {
            addCriterion("second_distributor >", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_distributor >=", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorLessThan(Integer value) {
            addCriterion("second_distributor <", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorLessThanOrEqualTo(Integer value) {
            addCriterion("second_distributor <=", value, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorIn(List<Integer> values) {
            addCriterion("second_distributor in", values, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorNotIn(List<Integer> values) {
            addCriterion("second_distributor not in", values, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorBetween(Integer value1, Integer value2) {
            addCriterion("second_distributor between", value1, value2, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andSecondDistributorNotBetween(Integer value1, Integer value2) {
            addCriterion("second_distributor not between", value1, value2, "secondDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueIsNull() {
            addCriterion("final_distribute_true is null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueIsNotNull() {
            addCriterion("final_distribute_true is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueEqualTo(Integer value) {
            addCriterion("final_distribute_true =", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueNotEqualTo(Integer value) {
            addCriterion("final_distribute_true <>", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueGreaterThan(Integer value) {
            addCriterion("final_distribute_true >", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_distribute_true >=", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueLessThan(Integer value) {
            addCriterion("final_distribute_true <", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueLessThanOrEqualTo(Integer value) {
            addCriterion("final_distribute_true <=", value, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueIn(List<Integer> values) {
            addCriterion("final_distribute_true in", values, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueNotIn(List<Integer> values) {
            addCriterion("final_distribute_true not in", values, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueBetween(Integer value1, Integer value2) {
            addCriterion("final_distribute_true between", value1, value2, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTrueNotBetween(Integer value1, Integer value2) {
            addCriterion("final_distribute_true not between", value1, value2, "finalDistributeTrue");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdIsNull() {
            addCriterion("final_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdIsNotNull() {
            addCriterion("final_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdEqualTo(Integer value) {
            addCriterion("final_user_id =", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdNotEqualTo(Integer value) {
            addCriterion("final_user_id <>", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdGreaterThan(Integer value) {
            addCriterion("final_user_id >", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_user_id >=", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdLessThan(Integer value) {
            addCriterion("final_user_id <", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("final_user_id <=", value, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdIn(List<Integer> values) {
            addCriterion("final_user_id in", values, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdNotIn(List<Integer> values) {
            addCriterion("final_user_id not in", values, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdBetween(Integer value1, Integer value2) {
            addCriterion("final_user_id between", value1, value2, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("final_user_id not between", value1, value2, "finalUserId");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineIsNull() {
            addCriterion("final_deadline is null");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineIsNotNull() {
            addCriterion("final_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineEqualTo(Date value) {
            addCriterion("final_deadline =", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineNotEqualTo(Date value) {
            addCriterion("final_deadline <>", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineGreaterThan(Date value) {
            addCriterion("final_deadline >", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("final_deadline >=", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineLessThan(Date value) {
            addCriterion("final_deadline <", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("final_deadline <=", value, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineIn(List<Date> values) {
            addCriterion("final_deadline in", values, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineNotIn(List<Date> values) {
            addCriterion("final_deadline not in", values, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineBetween(Date value1, Date value2) {
            addCriterion("final_deadline between", value1, value2, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("final_deadline not between", value1, value2, "finalDeadline");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeIsNull() {
            addCriterion("final_distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeIsNotNull() {
            addCriterion("final_distribute_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeEqualTo(Date value) {
            addCriterion("final_distribute_time =", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeNotEqualTo(Date value) {
            addCriterion("final_distribute_time <>", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeGreaterThan(Date value) {
            addCriterion("final_distribute_time >", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("final_distribute_time >=", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeLessThan(Date value) {
            addCriterion("final_distribute_time <", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeLessThanOrEqualTo(Date value) {
            addCriterion("final_distribute_time <=", value, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeIn(List<Date> values) {
            addCriterion("final_distribute_time in", values, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeNotIn(List<Date> values) {
            addCriterion("final_distribute_time not in", values, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeBetween(Date value1, Date value2) {
            addCriterion("final_distribute_time between", value1, value2, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributeTimeNotBetween(Date value1, Date value2) {
            addCriterion("final_distribute_time not between", value1, value2, "finalDistributeTime");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorIsNull() {
            addCriterion("final_distributor is null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorIsNotNull() {
            addCriterion("final_distributor is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorEqualTo(Integer value) {
            addCriterion("final_distributor =", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorNotEqualTo(Integer value) {
            addCriterion("final_distributor <>", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorGreaterThan(Integer value) {
            addCriterion("final_distributor >", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_distributor >=", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorLessThan(Integer value) {
            addCriterion("final_distributor <", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorLessThanOrEqualTo(Integer value) {
            addCriterion("final_distributor <=", value, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorIn(List<Integer> values) {
            addCriterion("final_distributor in", values, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorNotIn(List<Integer> values) {
            addCriterion("final_distributor not in", values, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorBetween(Integer value1, Integer value2) {
            addCriterion("final_distributor between", value1, value2, "finalDistributor");
            return (Criteria) this;
        }

        public Criteria andFinalDistributorNotBetween(Integer value1, Integer value2) {
            addCriterion("final_distributor not between", value1, value2, "finalDistributor");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}