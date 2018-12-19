<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="rodo" class="ksarfo.javaee.zad04.domain.Rodo" scope="session" />

<%
    if(!rodo.isPersonalDataAcc() || !rodo.isSellingDataAcc()) {
        response.sendRedirect("rodoMain.jsp");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop</title>
    </head>
    <body>
        <h2>Watch store</h2>
        <p><a href="getWatchData.jsp"><input type='submit' value = 'Add a new watch'/></a></p>
        <p><a href="showAllWatches.jsp"><input type='submit' value = 'Show all watches'/></a></p>
        <p><a href="cart.jsp"><input type='submit' value = 'Cart'/></a></p>
        
    </body>
</html>