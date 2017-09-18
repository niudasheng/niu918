package com.vem.tools;

import javax.servlet.http.HttpServletRequest;

/**
 * 判断session值是否存在工具类
 * 
 * @author 李团诚
 */
public class JudgeSessionTool {

    /**
     * 判断session值是否存在方法
     * 
     * @author 李团诚
     */
    public static boolean judgeSession(HttpServletRequest request) {
        try {
            @SuppressWarnings("unused")
            int userId = (int) request.getSession().getAttribute("before_userId");// 为false说明不存在，反之存在
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
