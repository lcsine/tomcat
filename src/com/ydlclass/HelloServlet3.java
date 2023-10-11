package com.ydlclass;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

public class HelloServlet3 extends HttpServlet {
    //乱码问题
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("service()被执行了一次");
        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = resp.getWriter();
//        writer.print("<h1>你好!呀 service</h1>");
//        writer.flush();
        //重定向 方式一
        resp.setStatus(302);
        resp.setHeader("Location","https://www.baidu.com");
        //重定向 方式二
        resp.sendRedirect("https://www.baidu.com");

        //请求转发 HelloServlet代码

    }
}
