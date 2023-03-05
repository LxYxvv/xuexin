package com.example.xuexin.controller;

import com.example.xuexin.vo.ResponseResult;
import com.example.xuexin.entity.User;
import com.example.xuexin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 使用手机号码登录
    @PostMapping(value = "login")
    public ResponseResult login(HttpServletRequest request, @RequestBody Map<String, String> param) {
        ResponseResult responseResult = new ResponseResult();
        HttpSession session = request.getSession();

        String phone = param.get("phone");
        String password = param.get("password");

        if (phone == null) {
            responseResult.setCode(40010).setMsg("手机号为空");
        } else {
            User user = userService.login(phone);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    responseResult.setCode(20010).setMsg("登录成功").addData("role",user.getRole());
                    session.setAttribute("user", user);
                } else {
                    responseResult.setCode(40011).setMsg("密码错误");
                }
            } else {
                responseResult.setCode(40012).setMsg("手机号未注册");
            }
        }
        return responseResult;
    }

    // 注销登录
    @GetMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        // TODO 注销登录跳转登录页面待更改
    }

    // 用户注册
    @PostMapping("register")
    public ResponseResult register(@RequestBody User user) {
        return userService.register(user);
    }
}

