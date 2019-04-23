package com.retech.tpcms.service.impl;

import com.retech.tpcms.entity.*;
import com.retech.tpcms.entity.custom.CustomResource;
import com.retech.tpcms.entity.custom.CustomSearchBean;
import com.retech.tpcms.entity.custom.Distribute;
import com.retech.tpcms.mapper.ApprovalMapper;
import com.retech.tpcms.mapper.ResourceMapper;
import com.retech.tpcms.service.ResourceService;
import com.retech.tpcms.utils.ActionResult;
import com.retech.tpcms.utils.FastDFSClient;
import com.retech.tpcms.utils.XmlUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qinc
 * @date 2019/3/27
 */
@Service
public class ResourceServiceImpl implements ResourceService {


    @Autowired
    private ResourceMapper resourceMapper;

    @Autowired
    private ApprovalMapper approvalMapper;

    @Autowired
    private FastDFSClient fastDFSClient;

    @Override
    public ActionResult deleteById(Integer code) {
        int count = resourceMapper.deleteByPrimaryKey(code);
        if (count > 0) {
            return ActionResult.build(200, "删除资源成功！");
        }
        return ActionResult.build(-1, "删除资源失败");
    }

    @Override
    public ActionResult getResources(CustomResource resource, CustomSearchBean customSearchBean) {
        Map<String, Object> result = new HashMap<>();
        try {
            //暂时没有将creatorName、indexerName、secondAuditorName和finalAuditorName条件加入，待完善
            ResourceExample example = new ResourceExample();
            ResourceExample.Criteria criteria = example.createCriteria();
            if (StringUtils.isNotEmpty(resource.getName())) {
                criteria.andNameLike(resource.getName());
            } else if (StringUtils.isNotEmpty(resource.getFormat())) {
                criteria.andFormatEqualTo(resource.getFormat());
            } else if (resource.getKind() != null) {
                criteria.andKindEqualTo(resource.getKind());
            } else if (StringUtils.isNotEmpty(resource.getStartCreateTime()) && StringUtils.isNotEmpty(resource.getEndCreateTime())) {
                criteria.andInDateBetween(DateUtils.parseDate(resource.getStartCreateTime(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndCreateTime(), "yyyy-MM-dd"));
            } else if (StringUtils.isNotEmpty(resource.getStartIndexTime()) && StringUtils.isNotEmpty(resource.getEndIndexTime())) {
                criteria.andIndexTimeBetween(DateUtils.parseDate(resource.getStartIndexTime(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndIndexTime(), "yyyy-MM-dd"));
            } else if (StringUtils.isNotEmpty(resource.getStartSecondDistributeTime()) && StringUtils.isNotEmpty(resource.getEndSecondDistributeTime())) {
                criteria.andSecondDistributeTimeBetween(DateUtils.parseDate(resource.getStartSecondDistributeTime(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndSecondDistributeTime(), "yyyy-MM-dd"));
            } else if (StringUtils.isNotEmpty(resource.getStartSecondDeadline()) && StringUtils.isNotEmpty(resource.getEndSecondDeadline())) {
                criteria.andSecondDeadlineBetween(DateUtils.parseDate(resource.getStartSecondDeadline(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndSecondDeadline(), "yyyy-MM-dd"));
            } else if (StringUtils.isNotEmpty(resource.getStartFinalDistributeTime()) && StringUtils.isNotEmpty(resource.getEndFinalDistributeTime())) {
                criteria.andFinalDistributeTimeBetween(DateUtils.parseDate(resource.getStartFinalDistributeTime(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndFinalDistributeTime(), "yyyy-MM-dd"));
            } else if (StringUtils.isNotEmpty(resource.getStartFinalDeadline()) && StringUtils.isNotEmpty(resource.getEndFinalDeadline())) {
                criteria.andFinalDeadlineBetween(DateUtils.parseDate(resource.getStartFinalDeadline(), "yyyy-MM-dd"),
                        DateUtils.parseDate(resource.getEndFinalDeadline(), "yyyy-MM-dd"));
            } else if (resource.getStageCode() != null) {
                criteria.andStageCodeEqualTo(resource.getStageCode());
            } else if (resource.getClassCode() != null) {
                criteria.andClassCodeEqualTo(resource.getClassCode());
            } else if (resource.getBookCode() != null) {
                criteria.andBookCodeEqualTo(resource.getBookCode());
            } else if (resource.getSubmitStatus() != null) {
                criteria.andSubmitStatusEqualTo(resource.getSubmitStatus());
            } else if (StringUtils.isNotEmpty(resource.getApprovalStatus())) {
                criteria.andApprovalStatusEqualTo(resource.getApprovalStatus());
            } else if (resource.getUploadStatus() != null) {
                criteria.andUploadStatusEqualTo(resource.getUploadStatus());
            }
            ResourceExample countExample = new ResourceExample();
            example.setOffset(customSearchBean.getStart());
            example.setLimit(customSearchBean.getLength());
            if (StringUtils.isNotEmpty(customSearchBean.getColumn()) && !customSearchBean.getColumn().equalsIgnoreCase("undefined")) {
                String column = XmlUtils.getMapperColumnByProperty("ResourceMapper.xml", customSearchBean.getColumn(), false);
                example.setOrderByClause(column + " " + customSearchBean.getDir());
            }
            List<Resource> resources = resourceMapper.selectByExample(example);        //全部商品
            int count = resourceMapper.countByExample(countExample);            //总记录数
            result.put("total", count);
            result.put("rows", resources);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ActionResult.ok(result);
    }

    @Override
    public ActionResult update(ResourceWithBLOBs resource) {
        int count = resourceMapper.updateByPrimaryKeySelective(resource);
        if(count>0){
            return ActionResult.ok();
        }
        return ActionResult.build(-1,"索引/纠错失败");
    }

    @Override
    public ActionResult uploadCover(MultipartFile file,Integer code) {
        ResourceWithBLOBs resource = resourceMapper.selectByPrimaryKey(code);
        try {
            resource.setCover(fastDFSClient.uploadFile(file));
            resourceMapper.updateByPrimaryKey(resource);
        } catch (IOException e) {
            e.printStackTrace();
            return ActionResult.build(-1,"上传失败！");
        }
        return ActionResult.build(200, "上传成功！");
    }

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public ActionResult upload(MultipartFile file, HttpServletRequest request) {
        try {
            User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
            String url= fastDFSClient.uploadFile(file);
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
            ResourceWithBLOBs resource=new ResourceWithBLOBs();
            resource.setName(file.getOriginalFilename());
            resource.setResourceSize(file.getSize());
            resource.setUploadStatus(1);
            resource.setPreviewUrl(url);
            resource.setFormat(type);
            resource.setInBy(user.getId());
            resource.setInDate(new Date());
            resource.setOrgId(user.getOrgId());
            elasticsearchTemplate.createIndex(Resource.class);
            resourceMapper.insert(resource);
        } catch (Exception e) {
            e.printStackTrace();
            ActionResult.build(-1, "上传失败！");
        }
        return ActionResult.build(200, "上传成功！");
    }

    @Override
    public ActionResult reUpload(MultipartFile file, Integer code) {
        try {
            String url= fastDFSClient.uploadFile(file);
            ResourceWithBLOBs resource = resourceMapper.selectByPrimaryKey(code);
            resource.setPreviewUrl(url);
            resourceMapper.updateByPrimaryKey(resource);
        } catch (Exception e) {
            e.printStackTrace();
            ActionResult.build(-1, "上传失败！");
        }
        return ActionResult.build(200, "上传成功！");
    }

    @Override
    public ActionResult distributeBatch(Distribute distribute, HttpServletRequest request) {
        String[] ids = distribute.getCodes().split(",");
        try {
            User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
            Date date = DateUtils.parseDate(distribute.getDeadlineString(), "yyyy-MM-dd");
            Date now = new Date();
            for (String id:ids) {
                ResourceWithBLOBs resource = resourceMapper.selectByPrimaryKey(Integer.valueOf(id));
                if(distribute.getAuditingStage().equals(2)){//复审
                    resource.setSecondDistributeTrue(1);//已分配复审
                    resource.setSecondUserId(distribute.getUserId());
                    resource.setSecondDeadline(date);
                    resource.setSecondTaskDescription(distribute.getTaskDescription());
                    resource.setSecondDistributeTime(now);
                    resource.setSecondDistributor(user.getId());
                }else if(distribute.getAuditingStage().equals(3)){//终审
                    resource.setFinalDistributeTrue(1);//已分配终审
                    resource.setFinalUserId(distribute.getUserId());
                    resource.setFinalDeadline(date);
                    resource.setFinalTaskDescription(distribute.getTaskDescription());
                    resource.setFinalDistributeTime(now);
                    resource.setFinalDistributor(user.getId());
                }
                resourceMapper.updateByPrimaryKey(resource);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return ActionResult.build(-1, "分配审核失败！");
        }
        return ActionResult.build(200, "分配审核成功！");
    }

    @Override
    public ActionResult getResourceById(Integer code) {
        Map<String,Object>map=new HashMap<>();
        ResourceWithBLOBs resource = resourceMapper.selectByPrimaryKey(code);
        ApprovalExample example=new ApprovalExample();
        example.createCriteria().andCodeEqualTo(code);
        List<Approval> approvals = approvalMapper.selectByExample(example);
        map.put("resource",resource);
        map.put("approvals",approvals);
        return ActionResult.ok(map);
    }

    @Override
    public ActionResult indexBatch(ResourceWithBLOBs resource, String codes, HttpServletRequest request) {
        String[] ids = codes.split(",");
        User user = (User) request.getSession().getAttribute("LOGIN_SESSION");
        for (String id : ids) {
            resource.setCode(Integer.valueOf(id));
            resource.setIndexerId(user.getId());
            resourceMapper.updateByPrimaryKeySelective(resource);
        }
        return ActionResult.build(200, "标引成功！");
    }


    @Override
    public ActionResult deleteResourceBatch(String codes) {
        String[] ids = codes.split(",");
        for (String id : ids) {
            resourceMapper.deleteByPrimaryKey(Integer.valueOf(id));
        }
        return ActionResult.build(200, "删除成功！");
    }

    @Override
    public ActionResult submit(String codes) {
        String[] ids = codes.split(",");
        for (String id : ids) {
            Resource resource = resourceMapper.selectByPrimaryKey(Integer.valueOf(id));
            resource.setSubmitStatus(1);
            resourceMapper.updateByPrimaryKey(resource);
        }
        return ActionResult.build(200, "提交成功！");
    }
}
