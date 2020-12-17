package com.ssp.sst.serviceImpl;

import com.ssp.sst.bean.User;
import com.ssp.sst.dao.UserDao;
import com.ssp.sst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:UserServiceImpl
 * Description
 * @author  zhangqiang
 * @date  2020/12/1
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag =false;
        try {
            userDao.addUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try {
            userDao.updateUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean dateleUser(int userId) {
        boolean flag =false;
        try {
            userDao.deleteUser(userId);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public User findUserByName(String username) {
        return userDao.findByName(username);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findById(id);
    }



    @Override
    public List<User> findAll() {
        return  userDao.findAll();
    }
}
