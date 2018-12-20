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
<jsp:useBean id="phone" class="ksarfo.javaee.zad04.domain.Phone" scope="session" />

<form action="addNewPhone.jsp">

    <!--Id: <input type="text" name="id" value="${watch.id}" /><br />  -->
    Data produkcji: <input type="date"  name="dataProd" value="${watch.dateOfProduction}" /><br />
    Nazwa modelu:            <input type="text" name="name" value="${phone.name}" /><br />
    Ocena:<br />  	1<input type="radio" name="opinia" value="${phone.opinia}" />
    				|2<input type="radio" name="opinia" value="${phone.opinia}" />
    				|3<input type="radio" name="opinia" value="${phone.opinia}" />
    				|4<input type="radio" name="opinia" value="${phone.opinia}" />
    				|5<input type="radio" name="opinia" value="${phone.opinia}" /><br />
    
    
    Extra:  <br />        <input type="checkbox" name="extra" value="|Wodoodporny|" />Wodoodporny<br />
    				<input type="checkbox" name="extra" value="|Wstrząsoodporny|" />Wstrząsoodporny<br />
    				<input type="checkbox" name="extra" value="|Izotermiczny|" />Izotermiczny<br />
    				
    Cena:           <input type="double" name="price" value="${watch.price}" /><br />
    
    <input type="submit" value=" Add ">
    
  
</form>
	<p><a href="index.jsp"><input type='submit' value = 'Menu'/></a></p>
</body>
</html>
