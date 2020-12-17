package com.ssp.sst;

import com.ssp.sst.bean.User;
import com.ssp.sst.dao.UserDao;
import com.ssp.sst.service.UserService;
import com.ssp.sst.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.ssp.sst.dao")
class SstApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private UserService  userService;

    //单元测试新增用户
    @Test
    void  findAllUser(){//查询所有用户
        userService.findAll();
        System.out.println("查询成功");

    }
    /*
    void   updateUser(){  //更新用户
        int  userId=14;
        String userName="李四";
        int  userAge=22;

        User user= userService.findUserById(userId);
        if(user!=null){
            user.setName(userName);
            user.setAge(userAge);
            userService.updateUser(user);
            System.out.println("更新成功，返回");
        }else {
            System.out.println("该用户不存在");
        }

    }

     */
    /*
    void   deleteUser(){   //删除用户
        int userId = 12;
        userService.dateleUser(userId);
        System.out.println("删除成功，返回");
    }

     */
    /*
     void   findByName(){  //根据用户名查询
        String  userName="admin";
        int  userAge=22;
          userService.findUserByAge(userAge);
          System.out.println("查询成功，返回");
    }
    */

   /*
    void add() {       //新增一个用户
        User user = new User();
        user.setName("张强");
        user.setAge(25);

        userService.addUser(user);
        System.out.println("插入成功，返回");
    }
*/


}
