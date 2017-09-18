package com.vem.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vem.bean.User;
import com.vem.service.ICheckUserService;
import com.vem.tools.BaseResult;
import com.vem.tools.JsonWrite;

import redis.clients.jedis.Jedis;

/**
 * 后台校验Servlet
 */
@Controller
public class CheckUserController {

    @Resource(name = "checkUserService")
    private ICheckUserService checkUserService;

    @RequestMapping("/checkBehindUser.do")
    public void cancelManager(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("pwd");
        System.out.println(userName);
        User user = (User) checkUserService.checkcheck(userName, password);

        BaseResult baseResult = new BaseResult();

        if (user == null) {// 没有查询到数据时
            baseResult.setResultcode("101");
            baseResult.setResultmsg("失败");
        } else {
            baseResult.setResultcode("200");
            baseResult.setResultmsg("成功");
            request.getSession().setAttribute("behind_userId", user.getUserId());// 设置session值
            try {
                Jedis jedis = new Jedis("127.0.0.1");//启用redis
                if (jedis.ping().toString().equals("PONG")) {//如果redis启用成功
                    jedis.del("username");
                    jedis.set("username", userName);
                }
            } catch (Exception e) {
                System.err.println("redis服务端未开启");
            }
        }

        JsonWrite.jsonWrinte(baseResult, response);
    }

}