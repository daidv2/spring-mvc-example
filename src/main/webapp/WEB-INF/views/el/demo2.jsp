<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- Thư viện cơ bản (core) -->
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!-- Thư viện định dạng (format) -->
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!-- Thư viện hàm (function) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>El & JSTL</title>
</head>
<body>
    <c:set var="now" value="<%=new java.util.Date()%>" />
    <ul>
        <li>name: c</li>
        <li>age: ${student.age}<c:if test="${student.age > 18}"> - Người lớn</c:if></li>
        <hr>
        <li>items: ${items[0]}</li>
        <li>items: ${items[1]}</li>
        <hr>
        <li>majors: ${majors.app}</li>
        <li>majors: ${majors.web}</li>
        <hr>
        <li><fmt:formatNumber value="1000000" type="currency" /></li>
        <li><fmt:formatNumber value="0.51" type="percent" /></li>
        <li><fmt:formatDate value="${student.date}" pattern="dd-MM-yyyy" /></li>
    </ul>
</body>
</html>