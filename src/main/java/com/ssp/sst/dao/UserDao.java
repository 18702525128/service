package com.ssp.sst.dao;

import com.ssp.sst.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Title:UserDao
 * Description：用户数据处理接口
 * @author  zhangqiang
 * @date    2020/12/1
 */
@Repository
@Mapper  //表示接口基于此注解实现CRUD
public interface UserDao {
  /**
  * 增加用户
  * @param user
  */
    @Insert("INSERT INTO t_user(login_name,password,name,age) VALUES (#{login_name},#{password},#{name},#{age})")
   void  addUser(User user);

    /**
     * 用户数据修改
     * @param user
     */
    @Update("UPDATE t_user SET name=#{name},age=#{age} WHERE id=#{id} AND delete_flag=0")
    void  updateUser(User user);

    /**
     * 用户数据假删除   将删除标记更新为1
     * @param id
     */
    @Delete("UPDATE t_user SET delete_flag=1  WHERE id=#{id}")
    void  deleteUser(@Param("id") int  id);


    /**
     * 根据名字查询用户信息
     * @param login_name
     * @return
     */
    @Select("SELECT * FROM t_user WHERE login_name=#{login_name} AND delete_flag=0")
     User findByName(@Param("login_name") String  login_name);

 /**
  * 根据id查询用户信息
  * @param id
  * @return
  */
 @Select("SELECT * FROM t_user WHERE id=#{id} AND delete_flag=0")
     User findById(@Param("id") int  id);
    /**
     * 查询所有
     * @return
     */
    @Select("SELECT *  FROM t_user  WHERE  delete_flag=0")
     List<User>  findAll();

}
