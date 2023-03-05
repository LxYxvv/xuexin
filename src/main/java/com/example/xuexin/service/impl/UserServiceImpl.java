package com.example.xuexin.service.impl;

import com.example.xuexin.vo.ResponseResult;
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

    public ResponseResult register(User user) {
        ResponseResult responseResult = new ResponseResult();
        User userExist = userMapper.findByIdNumber(user.getId_number());
        // 检查必需注册信息
        if (user.getName() != null && user.getPhone() != null && user.getPassword() != null && user.getEmail() != null && user.getId_number() != null) {
            // 检查身份证是否注册
            if (userExist == null) {
                userMapper.save(user);
                responseResult.setCode(20020).setMsg("注册用户成功");
            } else {
                responseResult.setCode(40021).setMsg("身份号已被注册");
            }
        } else {
            responseResult.setCode(40020).setMsg("提交的注册信息不全");
        }
        return responseResult;
    }

    @Override
    public String SelectRole(String id_number, Integer role) {
        return null;
    }

    @Override
    public String saveRole(User user) {
        return null;
    }
}
