package com.retech.tpcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qinc
 * @date 2018/12/27
 */
@Controller
public class PageController {


    @RequestMapping("/upload.html")
    public String upload() {
        return "upload";
    }

    @RequestMapping("/login.html")
    public String login() {
        return "login";
    }

    @RequestMapping("/index.html")
    public String index() {
        return "index";
    }

}
