package com.example.servletjspdemo.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "        <title>Zadanie02</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h2>Zad02 JavaEE</h2>\n" +
                "        <p><a href=\"about\">Student</a></p>\n" +
                "        <p><a href=\"date\">Data</a></p>\n" +
                "    </body>\n" +
                "</html>");
        out.close();
    }
}
