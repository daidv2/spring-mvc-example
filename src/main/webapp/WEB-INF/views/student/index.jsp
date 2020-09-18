<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
    <h2>Student Information</h2>
    <form:form method="post" action="/springmvc/student/update" modelAttribute="student">
        <table>
            <tr>
                <td><form:label path="id">id</form:label></td>
                <td><form:input path="id" readonly="true" /></td>
            </tr>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name" cssClass="form-control" /></td>
            </tr>
            <tr>
                <td><form:label path="age">Age</form:label></td>
                <td><form:input path="age" cssClass="form-control" /></td>
            </tr>
            <tr>
                <td><form:label path="major">Chuyên ngành</form:label></td>
                <td>
                    <form:select path="major" items="${majors}" cssClass="form-control"/>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>