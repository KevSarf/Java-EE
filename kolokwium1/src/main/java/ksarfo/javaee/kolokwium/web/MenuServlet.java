package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class MenuServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Time&Watch Store</h1> <br>" +
                "Menu: <br>" +
                "<ul>" +
                "<li><a href='add-new-watch'>Add new watch</a></li>" +
                "<li><a href='enable-watches'>Enable watches</a></li>" +
                "<li><a href='your-cart'>Your cart</a></li>" +
                "</ul>" +
                "</body></html>");
        out.close();
    }

}
