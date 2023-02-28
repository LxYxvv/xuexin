package com.example.xuexin.service.impl;

import com.example.xuexin.entity.User;
import com.example.xuexin.mapper.UserMapper;
import com.example.xuexin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String phone) {
        return userMapper.findUserByPhone(phone);
    }
}
