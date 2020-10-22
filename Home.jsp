<%@page import="com.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
 <div align="center">
  <div style="font-size: 80px;">Home Page</div>
  <%
    User obj = (User)session.getAttribute("user");
    System.out.println(obj+" = Session");
    String name =obj.getUserFirstName();
    String last = obj.getUserLastName();
  
  %> 
  <h1>Welcome "<%= name  + last%>"</h1>
  
  </div>
  <div align="center"><a href="Logout.jsp">Logout</a></div>
</body>
</html>
