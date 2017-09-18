package com.vem.tools;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RightFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession(true);

        // 从session里取的用户名信息
        Object attribute = session.getAttribute("before_userId");

        // 判断如果没有取到用户信息,就跳转到登陆页面
        if (attribute == null) {
            // 跳转到登陆页面
            res.sendRedirect("http://" + req.getHeader("Host") + "/Virgo/pages/before/login.html");
        } else {
            // 已经登陆,继续此次请求
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }
}