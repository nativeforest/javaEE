<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div id="register-field" style="background-color:lightgreen;" >
<form action="loginRegister" method="post" >
<label>${registerErrorMessage}</label>
<label>Name:</label>
<input type="text" name="register-name">
<label>UserName:</label>
<input type="text" name="register-userName">
<label>Email:</label>
<input type="email"name="register-email">
<label>Code:</label>
<input type="text" name="register-code">
<label>Password:</label>
<input type="password" name="register-password">
<label>Repeat Password:</label>
<input type="password" name="register-repeat-password">
<button type="submit" value= "register" name="submit">Submit</button>
<label><a href="login.jsp">Login</a></label>
</form>

</div>

<progress value="50" max="100"> </progress>

</body>
</html>