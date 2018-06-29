package com.example.what.Servlet;

import javax.servlet.*;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;

public abstract class MyServlet implements Servlet {
    @Override
    public void destroy(){
    }
    @Override
    public ServletConfig getServletConfig(){
        return null;
    }
    @Override
    public String getServletInfo(){
        return null;
    }
    @Override
    public void init(ServletConfig config)throws ServletException {

    }
    @Override
    public void service(ServletRequest req, ServletResponse res)
        throws ServletException,IOException {
    }

}
