<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<%-- <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 --%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home / List of customers</title>
</head>
<body>
<p>home / List of customers</p>
 <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>

<table border="1">
<tr>
<th>NAME</th>
<th>AGE</th>
<th>EXAM</th>                  
</tr>
<c:forEach items="${customerList}" var="customer">
<tr>
<td>${customer.name}</td>
<td>${customer.age}</td>
<td>${customer.examid}</td>

<!-- DELETE,PUT,OPTIONS REST
TODO: JSON POINT , MVC BASIC, WEB SERVICE, SEE JAVA EE 6,AJAX, DATATABLE WITH LIMIT -->
</tr>
</c:forEach>

  
    </table>
</body>
</html>