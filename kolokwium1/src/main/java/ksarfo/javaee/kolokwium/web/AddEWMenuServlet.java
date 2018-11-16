package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ksarfo.javaee.kolokwium.domain.Watch;
import ksarfo.javaee.kolokwium.service.StorageService;

@WebServlet(urlPatterns = "/watch-store")
public class AddEWMenuServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");

		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

		String producer = request.getParameter("producer");
		
		String name = request.getParameter("name");
		
		
		Date dateOfProduction = null;
		try {
			dateOfProduction = formatter.parse(request.getParameter("dateOfProduction"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		boolean waterproof = Boolean.parseBoolean(request.getParameter("waterproof"));
		double price = Integer.parseInt(request.getParameter("price"));


		int id = ss.getId();

		Watch newWatch = new Watch(id, producer, name, dateOfProduction, waterproof, price);

		ss.add(newWatch);

		List<Watch> allWatches = ss.getAllWatches();

		out.append("<html><body><h2>Enable Watches:</h2>");

		for (Watch watch: allWatches) {
			out.append("<h3><p>Id: " + watch.getId() + "</p></h3>");
			out.append("<p>Name: " + watch.getName() + "</p>");
			out.append("<p>Producer: " + watch.getProducer() + "</p>");
			out.append("<p>Date of production: " + watch.getDateOfProduction() + "</p>");
			out.append("<p>Waterproof: " + watch.isWaterproof() + "</p>");
			out.append("<p>Price: " + watch.getPrice() + " USD</p>");
			
		}

		out.append("<a href='add-new-watch'>Add new watch</a><br>");
        out.append("<br><a href='/zad03'>Menu</a><br>");
		out.append("</body></html>");
		out.close();
	}

	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}
