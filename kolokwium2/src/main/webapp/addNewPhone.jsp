<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New watch</title>
</head>
<body>
<jsp:useBean id="phone" class="ksarfo.javaee.zad04.domain.Phone" scope="session" />

<%
	String selectedExtras="";

	for (String extra : request.getParameterValues("extra")) {
		selectedExtras += extra + "\n";
	}    
	
    phone.setDataProd(request.getParameter("dataProd"));
    phone.setName(request.getParameter("name"));
    phone.setOpinia(request.getParameter("opinia"));
    phone.setExtra(selectedExtras);
    phone.setPrice(Double.parseDouble(request.getParameter("price")));
%>


<jsp:useBean id="storage" class="ksarfo.javaee.zad04.service.StorageService" scope="application" />

<%
	long id = storage.getId();
	phone.setId(id);
	storage.add(phone);
%>

<h1>Watch added</h1>
	<p><a href="getPhoneData.jsp"><input type='submit' value = 'Add a new phone'/></a></p>
	<p><a href="showAllPhones.jsp"><input type='submit' value = 'Show all phones'/></a></p>
	<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>

</body>
</html>