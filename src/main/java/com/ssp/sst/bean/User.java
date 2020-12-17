package com.ssp.sst.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;

public class User {
    private  int id;
    private  String login_name;
    private  String password;
    private  String name;
    private  int age;
    //时间转化为时间戳
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp create_time;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private  Timestamp update_time;
    private  int  delete_flag;


    //无参构造
    public User(){

    }
    //有参构造
  public  User(int  id,String login_name,String password,String name,int age,Timestamp create_time,Timestamp update_time,int delete_flag){

         this.id = id;
         this.login_name=login_name;
         this.password = password;
         this.name = name;
         this.age = age;
         this.create_time = create_time;
         this.update_time = update_time;
         this.delete_flag = delete_flag;
 }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }
}
