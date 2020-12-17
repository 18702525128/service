package com.ssp.sst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = "/toPage",method = RequestMethod.GET)
    public  String toPage(HttpServletRequest request){
        String url= request.getParameter("url");
        return  url;
    }
}
