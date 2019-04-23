package com.retech.tpcms.controller;

import com.retech.tpcms.aspect.LogAnnotation;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.Approval;
import com.retech.tpcms.service.ApprovalService;
import com.retech.tpcms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qinc
 * @date 2019/4/4
 */
@RestController
@RequestMapping("/approval")
public class ApprovalController {

    @Autowired
    private ApprovalService approvalService;

    @PutMapping("/approvalBatch")
    /**
     *@description 批量审核
     *@params [approval, codes, request]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "审核", optType = LogAspect.LOG_TYPE_ADD, content = "教材批量审核")
    public ActionResult approvalBatch(Approval approval, String codes, HttpServletRequest request) {
        return approvalService.approvalBatch(approval, codes, request);
    }

    @GetMapping("/list/{code}")
    /**
     *@description 批量审核
     *@params [code]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_SELECT, content = "教材审核流程")
    public ActionResult listByResourceId(@PathVariable Integer code) {
        return approvalService.listByResourceId(code);
    }
}
