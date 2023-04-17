package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.nio.file.Paths;

@Controller
public class IndexController {
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String index(){
        //WEB-INF/views/index.jsp
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/")
    public String postIndex(){
        return "";
    }
}
