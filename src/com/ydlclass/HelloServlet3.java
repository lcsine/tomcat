package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.UUID;

public class HelloServlet3 extends HttpServlet {
    //乱码问题
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("service()被执行了一次");
        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = resp.getWriter();
//        writer.print("<h1>你好!呀 service</h1>");
//        writer.flush();
//        //重定向 方式一
//        resp.setStatus(302);
//        resp.setHeader("Location","https://www.baidu.com");
//        //重定向 方式二
//        resp.sendRedirect("https://www.baidu.com");
//        req.setAttribute("us","nn");
//        HttpSession session = req.getSession();
//        session.setAttribute("us","ss");
//        //请求转发 HelloServlet代码
//        req.getRequestDispatcher("/hello2").forward(req,resp);
        System.out.println(getInitParameter("name"));
        resp.setHeader("ccc","666");
        req.setAttribute("name","sss");
        System.out.println(getServletInfo());
        System.out.println("==========");
        System.out.println(getServletName());


    }
}
