package ksarfo.javaee.kolokwium.web;



@WebServlet("/wypelnij")
public class WypelnijServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sejsa = request.getSession();
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Prosze uzupelnic pola:</h2>" +
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
