<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록 페이지</title>
</head>
<body>

<h2>사원목록</h2>
<table>
<tr>
<td>사원번호</td>
<td>이름</td>
<td>성</td>
<td>연락처</td>
<td>부서</td>
</tr>
<c:forEach var="emp" items="${empList}">
<tr>
<td><a href="/hr/info?empId=${emp.employeeId}">${emp.employeeId}</a></td>
<td>${emp.firstName}</td>
<td>${emp.lastName}</td>
<td>${emp.phoneNumber}</td>
<td>${emp.departmentId}</td>
</tr>
</c:forEach>
</table>
</body>
</html>



