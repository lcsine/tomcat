package com.ydlclass;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

public class HelloServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        String name = req.getParameter("name");
//        String[] parameterNames = req.getParameterValues("name");
//        System.out.println("parameterNames = " + Arrays.toString(parameterNames));
//        System.out.println("name = " + name);
//        Cookie[] cookies = req.getCookies();
//        System.out.println("cookies = " + Arrays.toString(cookies));
//        String contextPath = req.getContextPath();
//        System.out.println("contextPath = " + contextPath);
//        String requestURI = req.getRequestURI();
//        System.out.println("requestURI = " + requestURI);
//        StringBuffer requestURL = req.getRequestURL();
//        System.out.println("requestURL = " + requestURL);
//        String tyb = req.getHeader("tyb");
//        System.out.println("tyb = " + tyb);
//        Enumeration<String> headerNames = req.getHeaderNames();
//       while (headerNames.hasMoreElements()){
//           String key = headerNames.nextElement();
//           String value = req.getHeader(key);
//           System.out.println(key+":"+value);
//       }
        System.out.println(" = " +2);
        Object us = req.getAttribute("us");
        HttpSession session = req.getSession();
        Object us1 = session.getAttribute("us");
        System.out.println("us = " + us);
        System.out.println("us1 = " + us1);
    }
}
