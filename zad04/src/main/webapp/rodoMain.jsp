<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>RODO</title>
</head>
<body>

<h1>Aby korzystać z serwisu zaakceptuj RODO</h1>
<body>
    <form method="POST" action="rodoAccepted.jsp">
        <p>
            Wyrażam zgodę na przetwarzanie danych osobowych.
            <input type='checkbox' name='personalDataAcc' required>
        </p>
        <p>
            Wyrażam zgodę na przekazywanie moich danych w celach realizacji zamówienia.
            <input type='checkbox' name='sellingDataAcc' required>
        </p>
        <input type='submit' value='Dalej'/>
    </form>
    
    <a href="rodoReject.jsp"><input type='submit' value='Nie wyrażam zgody'/></a>
</body>
</html>