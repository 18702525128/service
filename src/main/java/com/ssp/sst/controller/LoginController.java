package com.ssp.sst.controller;


import com.ssp.sst.bean.User;
import com.ssp.sst.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
     @Resource
     UserServiceImpl usi;


     @RequestMapping("/login")
     public  String login(){

         return  "login";
     }

     @RequestMapping(value = "/userLogin/submit")
    public  String userLogin(HttpServletRequest request){

        String username = request.getParameter("username");
        String  password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        String str="";
         User user=usi.findUserByName(username);
        if( user.getPassword().equals(password)){
             str="index";
        }else {
            str="login";
        }
        return  str;
    }
}
