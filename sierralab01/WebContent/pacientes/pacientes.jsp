<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"  %>    
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home / List of customers</title>
</head>
<body>
<p>home / List of customers</p>
<table border="1">
<tr>
<th>NAME</th>
<th>AGE</th>
<th>EXAM</th>
</tr>
<j:forEach items="${customerList}" var="customer">
<tr>
<td>${customer.name}</td>
<td>${customer.age}</td>
<td>${customer.examid}</td>
</tr>
</j:forEach>

</table>
</body>
</html>