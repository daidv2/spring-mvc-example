<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>El</title>
</head>
<body>
    <ul>
        <li>name: ${name}</li>
        <li>salary: ${salary}</li>
        <li>requestScope.name: ${requestScope.name}</li>
        <li>requestScope.salary: ${requestScope.salary}</li>
        <li>sessionScope.name: ${sessionScope.name}</li>
        <li>sessionScope.salary: ${sessionScope.salary}</li>
    </ul>
</body>
</html>