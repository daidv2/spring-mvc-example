<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
    <h2>Submitted Student Information</h2>
    <table>
        <tr>
            <td>ID</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${age}</td>
        </tr>
        <tr>
            <td>Major</td>
            <td>${major}</td>
        </tr>
    </table>
</body>
</html>