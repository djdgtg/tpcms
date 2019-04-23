package com.retech.tpcms.service;

import com.retech.tpcms.entity.Approval;
import com.retech.tpcms.utils.ActionResult;

import javax.servlet.http.HttpServletRequest;

public interface ApprovalService {

    ActionResult approvalBatch(Approval approval, String codes, HttpServletRequest request);

    ActionResult listByResourceId(Integer code);
}
