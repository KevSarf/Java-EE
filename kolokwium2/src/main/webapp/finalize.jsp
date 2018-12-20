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
<jsp:useBean id="cart" class="ksarfo.javaee.zad04.service.StorageService" scope="session" />
<jsp:useBean id="rodo" class="ksarfo.javaee.zad04.domain.Rodo" scope="session"/>

<%
    if(!rodo.isPersonalDataAcc() || !rodo.isSellingDataAcc()) {
        response.sendRedirect("rodoMain.jsp");
    }
%>


<h1>Tank you for purchase:</h1>

<%
			cart.cartClear();
			//storage.cartClear();
%>

<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>

</body>
</html>