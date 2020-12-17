package com.ssp.sst.service;

import com.ssp.sst.bean.User;

import java.util.List;

/***
 * Title:UserService
 * Description:用户接口
 * @author  zhangqiang
 * @date  2020/12/1
 */

public interface UserService {


    /**
     * 增加用户
     * @param user
     * @return
     */
    boolean addUser(User user);


    /**
     * 修改用户信息
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean  dateleUser(int  id);

    /**
     * 根据用户名字查询用户
     * @param username
     * @return
     */
    User  findUserByName(String username);

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    User findUserById(int id);


    /**
     * 查询所有
     * @return
     */
     List<User> findAll();

}
