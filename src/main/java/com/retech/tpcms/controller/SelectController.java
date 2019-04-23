package com.retech.tpcms.controller;

import com.retech.tpcms.utils.ActionResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinc
 * @date 2019/4/18
 */
@RestController
@RequestMapping("/select")
public class SelectController {

    @RequestMapping("/resTypes")
    public ActionResult getResTypeList(){
        return ActionResult.ok();
    }

    @RequestMapping("/kinds")
    public ActionResult getKindList(){
        return ActionResult.ok();
    }

    @RequestMapping("/subCodes")
    public ActionResult getSubCodeList(){
        return ActionResult.ok();
    }

    @RequestMapping("/stageCodes")
    public ActionResult getStageCodeList(){
        return ActionResult.ok();
    }

    @RequestMapping("/classCodes")
    public ActionResult getClassCodeList(){
        return ActionResult.ok();
    }

    @RequestMapping("/bookCodes")
    public ActionResult getBookCodeList(){
        return ActionResult.ok();
    }

    @RequestMapping("/publishing")
    public ActionResult getPublishingList(){
        return ActionResult.ok();
    }

    @RequestMapping("/users")
    public ActionResult getUserList(){
        return ActionResult.ok();
    }
}
