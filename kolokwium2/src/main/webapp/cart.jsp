<%@ page import="ksarfo.javaee.zad04.domain.Watch" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cart</title>
</head>
<body>
<jsp:useBean id="storage" class="ksarfo.javaee.zad04.service.StorageService" scope="application" />
<jsp:useBean id="watch" class="ksarfo.javaee.zad04.domain.Watch" scope="session" />
<jsp:useBean id="cart" class="ksarfo.javaee.zad04.service.StorageService" scope="session" />
<jsp:useBean id="rodo" class="ksarfo.javaee.zad04.domain.Rodo" scope="session" />

<%
    if(!rodo.isPersonalDataAcc() || !rodo.isSellingDataAcc()) {
        response.sendRedirect("getRodo.jsp");
    }
    if(request.getParameter("id") != null) {
        long id = Long.parseLong(request.getParameter("id"));
        watch = storage.getWatch(id);
        cart.add(watch);
    }
%>

<h1>Your cart:</h1>

<%
    double priceSum = 0.0;
    for (Watch cartWatch : cart.getAllWatches()) {
    	out.println("<div><p><b>Id:</b> " + cartWatch.getId() + ";<b> Production date</b>: " + cartWatch.getDateOfProduction() + "</p>");
  	 	out.println("<p><b>Name</b>: " + cartWatch.getName() + "; <b>Waterproof</b>: " + cartWatch.isWaterproof() + "</p>");
        out.println("<p><b>Producer</b>: " + cartWatch.getProducer() + ";<b> Price</b>: " + cartWatch.getPrice() + "</p>");
        out.println("------------------------------------------------");
        priceSum += cartWatch.getPrice();
        
    }
    out.println("<br />Total price: " + priceSum);
%>

<p><a href="finalize.jsp"><input type='submit' value = 'Buy'/></a></p>
<p><a href="showAllWatches.jsp"><input type='submit' value = 'Show all watches'/></a></p>
<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>

</body>
</html>