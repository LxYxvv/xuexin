package com.example.xuexin.service;

import com.example.xuexin.entity.User;

public interface UserService {

    /** 通过用户ID查找用户*/
   User login(String phone);

    /** 通过用户身份证查找用户*/
//    User findByIdNumber(Integer id_number);

    /** 注册成功，添加用户*/
//    void addUser(User user);

    /** 更改用户信息*/
//    void updateUser(User user);

}
