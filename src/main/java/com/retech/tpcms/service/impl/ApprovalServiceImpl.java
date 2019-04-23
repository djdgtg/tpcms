package com.retech.tpcms.service.impl;

import com.retech.tpcms.entity.Approval;
import com.retech.tpcms.entity.ApprovalExample;
import com.retech.tpcms.entity.ResourceWithBLOBs;
import com.retech.tpcms.entity.User;
import com.retech.tpcms.mapper.ApprovalMapper;
import com.retech.tpcms.mapper.ResourceMapper;
import com.retech.tpcms.service.ApprovalService;
import com.retech.tpcms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author qinc
 * @date 2019/4/4
 */
@Service
public class ApprovalServiceImpl implements ApprovalService {

    @Autowired
    private ApprovalMapper approvalMapper;

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public ActionResult approvalBatch(Approval approval, String codes, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
        String[] ids = codes.split(",");
        for (String id:ids) {
            approval.setCode(Integer.valueOf(id));
            approval.setEditTime(new Date());
            approval.setUserId(user.getId());
            approval.setOrgId(user.getOrgId());
            approvalMapper.insert(approval);
            ResourceWithBLOBs resource = resourceMapper.selectByPrimaryKey(Integer.valueOf(id));
            if(approval.getApprovalStatus().equals(1)){//通过
                resource.setApprovalStatus(""+approval.getApprovalNode().equals(1));//通过
                if(approval.getApprovalNode().equals(1)){//初审
                    resource.setStatus(1);

                }else if(approval.getApprovalNode().equals(3)){//终审
                    resource.setStatus(2);
                }
            }else if(approval.getApprovalStatus().equals(2)){//未通过
                resource.setApprovalStatus("-"+approval.getApprovalNode().equals(1));//未通过
                if(approval.getApprovalNode().equals(1)){//初审
                    resource.setStatus(3);
                }
            }
            resourceMapper.updateByPrimaryKey(resource);

        }
        return ActionResult.ok();
    }

    @Override
    public ActionResult listByResourceId(Integer code) {
        ApprovalExample example=new ApprovalExample();
        example.createCriteria().andCodeEqualTo(code);
        return ActionResult.ok(approvalMapper.selectByExample(example));
    }

}
