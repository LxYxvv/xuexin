package com.example.xuexin.controller;

import com.example.xuexin.entity.ResponseResult;
import com.example.xuexin.entity.User;
import com.example.xuexin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 使用手机号码登录
    @PostMapping(value = "login")
    public ResponseResult login(HttpServletRequest request, @RequestBody String phone, @RequestBody String password) {
        ResponseResult responseResult = new ResponseResult();
        HttpSession session = request.getSession();
        if (phone == null) {
            responseResult.setCode(20011).setMsg("手机号为空");
        } else {
            User user = userService.login(phone);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    responseResult.setCode(20010).setMsg("登录成功");
                    session.setAttribute("user", user);
                } else {
                    responseResult.setCode(20012).setMsg("密码错误");
                }
            } else {
                responseResult.setCode(20013).setMsg("用户不存在");
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
}
