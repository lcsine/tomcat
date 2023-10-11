package com.ydlclass;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()被执行了一次");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service1()被执行了一次");
//        PrintWriter writer = servletResponse.getWriter();
//        writer.print("hello service");
//        writer.flush();
        //请求转发
        servletRequest.getRequestDispatcher("/hello3").forward(servletRequest,servletResponse);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()被执行了一次");
    }
}
