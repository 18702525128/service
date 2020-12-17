package com.ssp.sst.controller;

import com.ssp.sst.bean.AjaxResponse;
import com.ssp.sst.bean.User;
import com.ssp.sst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public AjaxResponse addUser(@RequestBody User user){
        System.out.println("开始新增用户");
        if(userService.findUserByName(user.getName()) ==null){ //根据用户名查询数据库为空
            userService.addUser(user);                        //添加用户
          return  AjaxResponse.success();
        }else {
            return  AjaxResponse.fail();
        }
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public  AjaxResponse  updateUser(@RequestBody User user){

       if(userService.findUserById(user.getId()) !=null) {//该id用户存在

           boolean bool = userService.updateUser(user);//调用更新方法
           if(bool == true){
               System.out.println("开始更新用户");
               return  AjaxResponse.success();
           }else {
               return  AjaxResponse.fail();
           }

       }else {
           System.out.println("用户不存在，修改失败");
           return  AjaxResponse.fail();
       }



    }

    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public  AjaxResponse delete(@PathVariable int id){
      boolean bool =  userService.dateleUser(id);
        if(bool==true){
            System.out.println("开始删除用户");
            return  AjaxResponse.success();
        }else {
            return  AjaxResponse.fail();
        }


    }

    @RequestMapping(value = "/userName/{name}",method = RequestMethod.GET)
    public   AjaxResponse  findByUserName(@PathVariable  String name){
        User user;
        user = userService.findUserByName(name);
        if(user != null){
            System.out.println("开始根据用户名字进行查询");
            return  AjaxResponse.success(user);
        }else {
            return  AjaxResponse.fail();
        }
    }

    @RequestMapping(value = "/userId/{id}",method = RequestMethod.GET)
    public   AjaxResponse  findByUserId(@PathVariable int id){
         User user;
        user = userService.findUserById(id);
        if(user !=null){
            System.out.println("开始根据用户id进行查询");
            return AjaxResponse.success(user);
        }else {
            return  AjaxResponse.fail();
        }
    }


    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public  AjaxResponse findAll(){

        List<User>  userList;
        userList = userService.findAll();
        if(userList !=null){
            System.out.println("开始查找所有用户");
            return   AjaxResponse.success(userList);
        }else {
            return   AjaxResponse.fail();
        }

    }

}
