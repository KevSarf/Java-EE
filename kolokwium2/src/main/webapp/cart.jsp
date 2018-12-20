<%@ page import="ksarfo.javaee.zad04.domain.Phone" %>
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
<jsp:useBean id="watch" class="ksarfo.javaee.zad04.domain.Phone" scope="session" />
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
    for (Phone myCart : cart.getAllPhones()) {
    	 out.println("<div><p><b>Id:</b> " + myCart.getId() + "</p><p><b> Data produkcji</b>: " + myCart.getDataProd() + "</p>");
   	 	 out.println("<p><b>Nazwa</b>: " + myCart.getName() + "</p><p><b>Opinia</b>: " + myCart.getOpinia() + "</p>");
         out.println("<p><b>Extra</b>: " + myCart.getExtra() + "</p><p><b> Cena</b>: " + myCart.getPrice() + "</p>");
        out.println("------------------------------------------------");
        priceSum += myCart.getPrice();
        
    }
    out.println("<br />Total price: " + priceSum);
%>

<p><a href="finalize.jsp"><input type='submit' value = 'Buy'/></a></p>
<p><a href="showAllPhones.jsp"><input type='submit' value = 'Show all phones'/></a></p>
<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>

</body>
</html>