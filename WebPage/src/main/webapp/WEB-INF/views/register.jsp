<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form name="myform" action="registerProcess" method="POST" modelAttribute="user">
		<table style="background-color: skyblue; margin-left: 400px;">

			<tr>
				<td style="color: black"><h3>Registration page</h3></td>

			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username" ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" size="8" ></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phone" size="10"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register" 
					></td>
				<td></td>
			</tr>


		</table>
		<p>${message}</p>
	</form>
</body>
</html>