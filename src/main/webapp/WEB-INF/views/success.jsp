<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<h1>${Header }</h1>
	<h2>${Desc }</h2>
	<h1>Welcome, ${user.userName }</h1>
	<h1>Your email is ${user.email } </h1>
	<h1>Your password is ${user.password } try to secure it</h1>
</body>
</html>