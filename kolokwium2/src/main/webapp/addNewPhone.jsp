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
<jsp:useBean id="watch" class="ksarfo.javaee.zad04.domain.Watch" scope="session" />

<%
    Date dateOfProduction = null;
    try {
    	dateOfProduction = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateOfProduction"));
    } catch (ParseException e) {
        e.printStackTrace();
    }
    boolean isWaterproof = request.getParameter("waterproof") != null;
    double price = Double.parseDouble(request.getParameter("price"));
    watch.setDateOfProduction(dateOfProduction);
    watch.setName(request.getParameter("name"));
    watch.setProducer(request.getParameter("producer"));
    watch.setPrice(price);
    watch.setWaterproof(isWaterproof);
%>
<jsp:setProperty name="watch" property="producer" param="producer" />
<jsp:setProperty name="watch" property="price" param="price" />

<jsp:useBean id="storage" class="ksarfo.javaee.zad04.service.StorageService" scope="application" />

<%
	long id = storage.getId();
	watch.setId(id);
	storage.add(watch);
%>

<h1>Watch added</h1>
	<p><a href="getWatchData.jsp"><input type='submit' value = 'Add a new watch'/></a></p>
	<p><a href="showAllWatches.jsp"><input type='submit' value = 'Show all watches'/></a></p>
	<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>

</body>
</html>