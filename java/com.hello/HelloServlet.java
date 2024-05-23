package com.hello;

import java.io.PrintWriter;
import.java.io.IOException;
import jakartax.servlet.http.HttpServlet;
import jakartax.servlet.http.HttpServletRequest;
import jakartax.servlet.http.HttpServletResponse;

class HelloServleet extends HttpServlet {
    public void init(){
        System.out.println("init()");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){
                throws IOException, ServletException {
        System.out.println("doGet()");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Hello Servlet!!");
        out.println("</body>");
        out.println("</html>");

                }
    }


    public void destroy(){
        System.out.println("destroy()");
    }
}