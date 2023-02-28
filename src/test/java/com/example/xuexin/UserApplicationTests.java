package com.example.xuexin;

import com.example.xuexin.entity.User;
import com.example.xuexin.mapper.UserMapper;
import com.example.xuexin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.login("1752039733"));
    }
}
