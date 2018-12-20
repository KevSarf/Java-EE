<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New door</title>
</head>
<body>

<jsp:useBean id="storage" class="ksarfo.javaee.zad04.service.StorageService" scope="application" />
<jsp:useBean id="watch" class="ksarfo.javaee.zad04.domain.Watch" scope="session" />

<form action="addNewWatch.jsp">

    <!--Id: <input type="text" name="id" value="${watch.id}" /><br />  -->
    Production date: <input type="date"  name="dateOfProduction" value="${watch.dateOfProduction}" /><br />
    Name:            <input type="text" name="name" value="${watch.name}" /><br />
    Waterproof:      <input type="checkbox" name="waterproof" value="${watch.waterproof}" /><br />
    Producer:        <input type="text" name="producer" value="${watch.producer}" /><br />
    Price:           <input type="text" name="price" value="${watch.price}" /><br />
    
    <input type="submit" value=" Add ">
    
  
</form>
	<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>
</body>
</html>