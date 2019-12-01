<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body >

<div id="login-field"  style="background-color:tomato;">
	
	<form method="post"  action="" >
		<label>Login</label>
		<label>UserName:</label>
		<input id="login-userName">
		<label>Password</label>
		<input type="password" id="login-password">
		<label><a href="register.jsp">Register</a></label>
		<button type="submit" value="login" >Submit</button>
	</form>

</div>

</body>
</html>