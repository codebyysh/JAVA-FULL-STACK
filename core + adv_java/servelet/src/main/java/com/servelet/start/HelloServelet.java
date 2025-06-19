package com.servelet.start;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

public class HelloServelet {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context ctx = tomcat.addWebapp("", System.getProperty("java.io.tmpdir"));

        // Register servlet
        Tomcat.addServlet(ctx, "myservlet", myServlet());
        ctx.addServletMapping("/custom", "myservlet");

        tomcat.start();
        tomcat.getServer().await();
    }

    // Custom servlet
    private static HttpServlet myServlet() {
        return new HttpServlet() {
            protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
                out.println("<h2>Namaste Yashu! Ye tera servlet ka custom response hai 🔥</h2>");
            }
        };
    }
}
