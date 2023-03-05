package com.example.xuexin.service;

import com.example.xuexin.vo.ResponseResult;
import com.example.xuexin.entity.User;

public interface UserService {

    /** 通过用户ID查找用户*/
    User login(String phone);

    ResponseResult register(User user);

    String SelectRole(String id_number, Integer role);

    String saveRole(User user);

}
