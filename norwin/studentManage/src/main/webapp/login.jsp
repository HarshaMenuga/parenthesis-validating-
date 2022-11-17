<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body style="background-color: cyan;">
	<div align="center">
		<form action="register">
			<h1>
				<i>Login Here</i><hr>
			</h1>
			<label for="uname">UserName :: </label> 
			<input type="text" name="username" id="uname"><br>
			<br> <label for="password">Password :: </label> 
			<input type="password" name="password" id="pass"><br>
			<br>
			<input type="submit" value="login"><br>
			<label></label>
			<a href="register.jsp">register</a>
		</form>
	</div>
</body>
</html>