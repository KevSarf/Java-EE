<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rodoAcc</title>
</head>
<body>
<jsp:useBean id="rodo" class="ksarfo.javaee.zad04.domain.Rodo" scope="session" />

<%
    rodo.setPersonalDataAcc(request.getParameter("personalDataAcc") != null);
    rodo.setSellingDataAcc(request.getParameter("sellingDataAcc") != null);
    response.sendRedirect("index.jsp");
%>
</body>
</html>