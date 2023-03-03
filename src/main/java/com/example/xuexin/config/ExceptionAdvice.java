package com.example.xuexin.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice()
public class ExceptionAdvice {
    // 通用异常处理器
    @ExceptionHandler(Exception.class)
    public String GenericException(Exception ex) {
        // ex.printStackTrace();
        return ex.getMessage();
    }
}
