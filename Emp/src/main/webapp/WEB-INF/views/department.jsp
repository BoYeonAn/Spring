<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
</head>
<body>

<h2>부서 정보입력</h2>
<body>
<form action="/hr/dept/insert" method="post">
<table>
<tr><td>부서번호</td><td><input type="text" name="departmentId"></td></tr>
<tr><td>부서이름</td><td><input type="text" name="departmentTitle"></td></tr>
<tr><td>매니저</td><td>
<select name=managerId>
<c:forEach var="man" items="${manList}"/>
<option value="${man.employeeId}">${man.fristName}</option>

</select>
</td></tr>
<tr><td>지역번호</td><td>
<select name="locationId">
<c:forEach value="Loca" items="locaList">
<option value="${loca.locationId}">$[loca.city]</option> 
</c:forEach>
</select>
</td></tr>
<tr><td><input type=submit value=저장><input type=reset value=취소></td></tr>

</body>
</html>
