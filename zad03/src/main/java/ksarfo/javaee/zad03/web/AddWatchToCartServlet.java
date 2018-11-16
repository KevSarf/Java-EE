package ksarfo.javaee.zad03.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ksarfo.javaee.zad03.domain.Watch;
import ksarfo.javaee.zad03.service.StorageService;

@WebServlet(urlPatterns = "/add-to-cart")
public class AddWatchToCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession();														//sesja

        PrintWriter out = response.getWriter();

        StorageService ss = null;

        if (session.getAttribute("session_cart") == null) {
            ss = new StorageService();
        } else {
            ss = (StorageService) session.getAttribute("session_cart");
        }

        int id = Integer.parseInt(request.getParameter("id"));

        ss.addToCart(getWatch(id));

        session.setAttribute("session_cart", ss);

        List<Watch> watchesInCart = ss.getCart();

        out.append("<html><body><h2>Your Cart:</h2>");

        for (Watch watch: watchesInCart) {
            out.append("<h3><p>Id: " + watch.getId() + "</p></h3>");
            out.append("<p>Producer: " + watch.getProducer() + "</p>");
            out.append("<p>Name: " + watch.getName() + "</p>");
            out.append("<p>Date of production: " + watch.getDateOfProduction() + "</p>");
            out.append("<p>Waterproof: " + watch.isWaterproof() + "</p>");
            out.append("<p>Price: " + watch.getPrice() + " USD</p>");

        }

        out.append("<a href='enable-watches'>Enable watches</a><br>");
        out.append("<a href='your-cart'>Finalize</a>");
        out.append("<br><a href='/zad03'>Menu</a><br>");
        out.append("</body></html>");
        out.close();

    }

    @Override
    public void init() throws ServletException {

        // application context
        getServletContext().setAttribute("storage_service", new StorageService());
    }

    private Watch getWatch(int id){
        StorageService appStorage = (StorageService) getServletContext().getAttribute("storage_service");
        List<Watch> allWatches = appStorage.getAllWatches();
        Watch watchToCart = null;

        for(Watch watch: allWatches) {
            if(watch.getId() == id) {
                watchToCart = watch;
            }
        }

        return watchToCart;
    }
}
