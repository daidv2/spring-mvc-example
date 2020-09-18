<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>LOGIN</title>
</head>
<body>
	<h2>LOGIN</h2>
	<span style="color: red">${message}</span>
	<form action="/springmvc/login.htm" method="post">
		<div>Username</div>
		<input type="text" name="id">

		<div>Password</div>
		<input type="password" name="password">

		<hr>
		<button>Login</button>
	</form>
</body>
</html>