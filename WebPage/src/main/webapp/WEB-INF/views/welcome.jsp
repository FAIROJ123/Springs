<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>

<h3>Hi ${u.getUsername()}</h3>
	<h3>Welcome to my Page</h3>
	<h3>If you want to Logout click on This Link</h3>

		<a href="logout"><input type="submit" value="Logout"></input></a>

	
	
	


	

</body>
</html>
