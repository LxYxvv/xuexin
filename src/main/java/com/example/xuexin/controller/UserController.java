package com.example.xuexin.controller;

import com.example.xuexin.entity.User;
import com.example.xuexin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 使用手机号码登录
    @PostMapping("login")
    public Map<String, String> login(HttpServletRequest request, String phone, String password) {
        User user = userService.login(phone);
        Map map = new HashMap<String, String>();
        if (user != null) {
            if (user.getPassword().equals(password)) {
                map.put("code", "0");
                map.put("msg", "登录成功");
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
            } else {
                map.put("code", "1");
                map.put("msg", "密码错误");
            }
        } else {
            map.put("code", "2");
            map.put("msg", "用户不存在");
        }
        return map;
    }

    // 注销登录
    @GetMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect("/login");
        // TODO 注销登录跳转登录页面待更改
    }
}
