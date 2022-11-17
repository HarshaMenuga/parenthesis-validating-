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
	
		<form action="register" method="post">
			<h1>
				<i>Register Form</i><hr>
				
			</h1>
			<label for="uname">UserName :: </label> 
			<input type="text" name="name" id="uname"><br>
			<br> 
			<label for="age">Age :: </label> 
			<input type="text" name="age" id="age"><br>
			<br>
			<label for="course">Course :: </label> 
			<input type="text" name="course" id="course"><br>
			<br>
			<label for="pass">Password :: </label> 
			<input type="password" name="password" id="pass"><br>
			<br>
			
			<input type="submit" value="signin">
		</form>
	</div>
</body>
</html>