<%@ page import="ksarfo.javaee.zad04.domain.Phone" %>
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
  for (Phone phone : storage.getAllPhones()) {
 	 out.println("<div><p><b>Id:</b> " + phone.getId() + "</p><p><b> Data produkcji</b>: " + phone.getDataProd() + "</p>");
	 	 out.println("<p><b>Nazwa</b>: " + phone.getName() + "</p><p><b>Opinia</b>: " + phone.getOpinia() + "</p>");
     out.println("<p><b>Extra</b>: " + phone.getExtra() + "</p><p><b> Cena</b>: " + phone.getPrice() + "</p>");
      out.println("<form action='cart.jsp' method='post'>" +
              "<input name='id' hidden value='" + phone.getId() + "' />" +
              "<input type='submit' value=' Add to cart ' />" +
              "</form>"+"</div>");
      out.println();
  }
%>

<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>


</body>
</html>