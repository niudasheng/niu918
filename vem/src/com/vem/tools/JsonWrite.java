/*
 * File name:          JsonWrite.java
 * Copyright@Handkoo (China)
 * Editor:           JDK1.6.32
 */
package com.vem.tools;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:           卢锡文
 * <p>
 * Date:           2016年7月13日
 * <p>
 * Time:           下午4:59:57
 * <p>
 * Director:        卢锡文
 * <p>
 * <p>
 */
public class JsonWrite {
    public static void jsonWrinte(Object object, HttpServletResponse response) {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        String str = gson.toJson(object);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter writer;
        try {
            writer = response.getWriter();
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
