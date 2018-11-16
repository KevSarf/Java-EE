package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ksarfo.javaee.kolokwium.domain.Watch;
import ksarfo.javaee.kolokwium.service.StorageService;

@WebServlet(urlPatterns = "/enable-watches")
public class EnableWatchesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");

        List<Watch> allWatches = ss.getAllWatches();

        out.append("<html><body><h2>Enable watches:</h2>");

        for (Watch watch: allWatches) {

                out.append("<form action='add-to-cart'>");
                out.append("<input type='hidden' name='id' value='" + watch.getId() + "'/>");
                out.append("<h3><p>Id: " + watch.getId() + "</p></h3>");
                out.append("<p>Producer: " + watch.getProducer() + "</p>");
                out.append("<p>Name: " + watch.getName() + "</p>");
                out.append("<p>Date of production: " + watch.getDateOfProduction() + "</p>");
                out.append("<p>Waterproof: " + watch.isWaterproof() + "</p>");
                out.append("<p>Price: " + watch.getPrice() + " USD</p>");
                out.append("<input type='submit' value=' Add to Cart' />");
                out.append("</form>");
            
        }
        out.append("<br><a href='/zad03'>Menu</a><br>");
        out.append("</body></html>");
        out.close();
    }

    @Override
    public void init() throws ServletException {

        getServletContext().setAttribute("storage_service", new StorageService());
    }
}
