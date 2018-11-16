package ksarfo.javaee.kolokwium.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-new-watch")
public class AddNewWatchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Add new watch:</h2>" +
				"<form action='watch-store'>" +
				"Producer: <input type='text' name='producer' /> <br />" +
				"Name: <input type='text' name='name' /> <br />" +
				"Date of production: <input type='text' name='dateOfProduction' /> <br />" +
				"Waterproof: <select name='waterproof'>" +
				"<option value='true'>Yes</option>" +
				"<option value='false'>No</option>" +
				"</select><br />" +
				"Price: <input type='text' name='price' /> <br />" +
				"<input type='submit' value=' Add ' />" +
				"</form>" +
				"<br><a href='/zad03'>Menu</a><br>"+
				"</body></html>");
		out.close();
	}

}
