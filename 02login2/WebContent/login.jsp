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
	
	<form method="post"  action="loginRegister" >
	<div> ${registerSuccessMessage}</div>
	<div> ${loginErrorMessage}</div>
		<label>Login</label>
		<label>UserName:</label>
		<input id="login-userName" name = "login-userName">
		<label>Password</label>
		<input type="password" id="login-password" name = "login-password">
		<label><a href="register.jsp">Register</a></label>
		<button type="submit" value="login" name="submit" >Submit</button>
	</form>

</div>

</body>
</html>