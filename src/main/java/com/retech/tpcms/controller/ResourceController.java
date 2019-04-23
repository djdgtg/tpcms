package com.retech.tpcms.controller;

import com.retech.tpcms.aspect.LogAnnotation;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.ResourceWithBLOBs;
import com.retech.tpcms.entity.custom.CustomResource;
import com.retech.tpcms.entity.custom.CustomSearchBean;
import com.retech.tpcms.entity.custom.Distribute;
import com.retech.tpcms.service.ResourceService;
import com.retech.tpcms.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qinc
 * @date 2019/3/27
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;


    @GetMapping("/list")
    /**
     *@description 查询资源列表
     *@params [resource, customSearchBean]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_SELECT, content = "教材列表查询")
    public ActionResult list(CustomResource resource, CustomSearchBean customSearchBean) {
        return resourceService.getResources(resource,customSearchBean);
    }

    @GetMapping("/{code}")
    /**
     *@description 查询教材详情
     *@params [code]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_SELECT, content = "教材详情查询")
    public ActionResult getResourceById(@PathVariable Integer code) {
        return resourceService.getResourceById(code);
    }

    @RequestMapping("/upload")
    /**
     *@description 资源入库
     *@params [request]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_ADD, content = "教材入库")
    public ActionResult upload(MultipartFile file, HttpServletRequest request) {
        return resourceService.upload(file,request);
    }

    @RequestMapping("/reUpload")
    /**
     *@description 重新上传资源
     *@params [file, code]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材重传")
    public ActionResult reUpload(MultipartFile file,Integer code) {
        return resourceService.reUpload(file,code);
    }


    @RequestMapping("/uploadCover")
    /**
     *@description 上传封面
     *@params [file, code]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材上传封面")
    public ActionResult uploadCover(MultipartFile file,Integer code) {
        return resourceService.uploadCover(file,code);
    }


    @PutMapping("/indexBatch")
    /**
     *@description 批量索引
     *@params [resource, codes, request]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材批量标引")
    public ActionResult indexBatch(ResourceWithBLOBs resource, String codes,HttpServletRequest request) {
        return resourceService.indexBatch(resource,codes,request);
    }

    @PutMapping("/index")
    /**
     *@description 单个索引，教材纠错
     *@params [resource]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材纠错")
    public ActionResult index(ResourceWithBLOBs resource) {
        return resourceService.update(resource);
    }

    @DeleteMapping("/{code}")
    /**
     *@description 删除数据
     *@params [id]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_DELETE, content = "教材删除")
    public ActionResult deleteResourceById(@PathVariable Integer code) {
        return resourceService.deleteById(code);
    }

    @DeleteMapping("/deleteBatch/{codes}")
    /**
     *@description 批量删除
     *@params [codes]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_DELETE, content = "教材批量删除")
    public ActionResult deleteResourceBatch(@PathVariable String codes) {
        return resourceService.deleteResourceBatch(codes);
    }

    @PutMapping("/submit/{codes}")
    /**
     *@description 教材提交审核
     *@params [codes]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材提交审核")
    public ActionResult submit(@PathVariable String codes) {
        return resourceService.submit(codes);
    }

    @PutMapping("/distributeBatch")
    /**
     *@description 批量分配审核
     *@params [distribute, request]
     *@return ActionResult
     */
    @LogAnnotation(moduleName = "教材", optType = LogAspect.LOG_TYPE_UPDATE, content = "教材分配审核")
    public ActionResult distributeBatch(Distribute distribute,HttpServletRequest request){
        return resourceService.distributeBatch(distribute,request);
    }

}
