package com.retech.tpcms.service;

import com.retech.tpcms.entity.ResourceWithBLOBs;
import com.retech.tpcms.entity.custom.CustomResource;
import com.retech.tpcms.entity.custom.CustomSearchBean;
import com.retech.tpcms.entity.custom.Distribute;
import com.retech.tpcms.utils.ActionResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface ResourceService {

    ActionResult deleteById(Integer code);

    ActionResult upload(MultipartFile file, HttpServletRequest request);

    ActionResult indexBatch(ResourceWithBLOBs resource, String codes, HttpServletRequest request);

    ActionResult deleteResourceBatch(String codes);

    ActionResult submit(String codes);

    ActionResult getResources(CustomResource resource, CustomSearchBean customSearchBean);

    ActionResult update(ResourceWithBLOBs resource);

    ActionResult uploadCover(MultipartFile file,Integer code);

    ActionResult reUpload(MultipartFile file, Integer code);

    ActionResult distributeBatch(Distribute distribute, HttpServletRequest request);

    ActionResult getResourceById(Integer code);
}
