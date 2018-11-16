package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ksarfo.javaee.kolokwium.service.StorageService;

@WebServlet(urlPatterns = "/purchase")
public class PokazWszystkieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //session context
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();
        
        out.append("<html><body><h2>Enjoy your new watches !</h2>");
        
        session.removeAttribute("session_cart");

        out.append("<br><a href='/zad03'>Menu</a><br>");
        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        getServletContext().setAttribute("storage_service", new StorageService());
    }

}
