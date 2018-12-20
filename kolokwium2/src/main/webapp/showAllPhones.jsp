<%@ page import="ksarfo.javaee.zad04.domain.Watch" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enable watches</title>
</head>
<body>

<jsp:useBean id="storage" class="ksarfo.javaee.zad04.service.StorageService" scope="application" />
<%
  for (Watch watch : storage.getAllWatches()) {
	  out.println("<div><p><b>Id:</b> " + watch.getId() + ";<b> Production date</b>: " + watch.getDateOfProduction() + "</p>");
	  out.println("<p><b>Name</b>: " + watch.getName() + "; <b>Waterproof</b>: " + watch.isWaterproof() + "</p>");
      out.println("<p><b>Producer</b>: " + watch.getProducer() + ";<b> Price</b>: " + watch.getPrice() + "</p>");
      out.println("<form action='cart.jsp' method='post'>" +
              "<input name='id' hidden value='" + watch.getId() + "' />" +
              "<input type='submit' value=' Add to cart ' />" +
              "</form>"+"</div>");
      out.println();
  }
%>

<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>


</body>
</html>