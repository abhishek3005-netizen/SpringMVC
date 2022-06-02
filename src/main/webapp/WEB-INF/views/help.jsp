<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="org.springframework.format.datetime.joda.LocalDateTimeParser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

<h1>This is help page</h1>

<% 
/* String name = (String) request.getAttribute("name");
Integer rollnumber = (Integer) request.getAttribute("rollnumber");
LocalDateTime now = (LocalDateTime) request.getAttribute("time");  
*/
%>
<h1>The name is <%-- <%=name %> --%>${name}</h1>


<h1>The roll number is <%-- <%=rollnumber %>--%>${rollnumber }</h1>

<h1>The time is <%-- <%=now %> --%>${time }</h1>

<hr>

<c:forEach var="item" items="${marks }">
	<h1>${item }</h1>
</c:forEach>


</body>
</html>