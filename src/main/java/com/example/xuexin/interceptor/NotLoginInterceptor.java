package com.example.xuexin.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 拦截未登录用户跳转到登录页
public class NotLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            // TODO 这里需要根据前端的登录页再更改
            // response.sendRedirect("/login");
            response.setContentType("application/json;charset=utf-8");
            response.setStatus(401);
            response.getWriter().print("""
                    {
                        "code":40100,
                        "msg":"有没有一种可能，你还没有登录"
                    }\
                    """);
            return false;
        }
        return true;
    }
}