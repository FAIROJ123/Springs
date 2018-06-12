<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form name="myform"  action="loginprocess" method="POST" modelAttribute='user' >
		<table 
			style="background-color: gray; margin-left: 400px;">

			<tr>
				<td><h3 style="color:red;">${message }</h3>
					
			<tr>
				<td style="color: red"><h3>Login page</h3></td>

			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" ></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"
					style="color: green" ></td>
				<td><a href="register">Registration</a></td>
			</tr>

		</table>
	</form>
</body>
</html>