package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ksarfo.javaee.kolokwium.domain.Watch;
import ksarfo.javaee.kolokwium.service.StorageService;

@WebServlet(urlPatterns = "/your-cart")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //session context
        HttpSession session = request.getSession();

        PrintWriter out = response.getWriter();

        StorageService ss = null;

        if (session.getAttribute("session_cart") == null) {
            ss = new StorageService();
        } else {
            ss = (StorageService) session.getAttribute("session_cart");
        }

        List<Watch> watchesInCart = ss.getCart();

        out.append("<html><body><h2>Your Cart:</h2>");
        int toPay = 0;

        for (Watch watch: watchesInCart) {
            out.append("<h3><p>Id: " + watch.getId() + "</p></h3>");
            out.append("<p>Producer: " + watch.getProducer() + "</p>");
            out.append("<p>Name: " + watch.getName() + "</p>");
            out.append("<p>Date of production: " + watch.getDateOfProduction() + "</p>");
            out.append("<p>Waterproof: " + watch.isWaterproof() + "</p>");
            out.append("<p>Price: " + watch.getPrice() + " USD</p><br/>");


            toPay += watch.getPrice();
        }

        out.append("To pay: " + toPay +" USD<br/>");
        out.append("<br><a href='enable-watches'>Enable watches</a><br>");
        out.append("<a href='purchase'>Buy</a>");
        out.append("<br><a href='/zad03'>Menu</a><br>");
        out.append("</body></html>");
        out.close();

    }
}
