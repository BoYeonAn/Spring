<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 상세 정보 페이지</title>
</head>
<body>
<h2>사원 상세 정보</h2>
<table>
<tr><td>사원번호</td><td>${emp.employeeId}</td></tr>
<tr><td>이름, 성</td><td>${emp.firstName} ${emp.lastName}</td></tr>
<tr><td>이메일</td><td>${emp.email}</td></tr>
<tr><td>연락처</td><td>${emp.phoneNumber}</td></tr>
<tr><td>입사일</td><td>${emp.hireDate}</td></tr>
<tr><td>직무</td><td>${emp.jobTitle}{${emp.jobId}}</td></tr>
<tr><td>급여</td><td>${emp.salary}</td></tr>
<tr><td>보너스율</td><td>${emp.commissionPct}</td></tr>
<tr><td>매니저</td><td>${emp.managerId}</td></tr>
<tr><td>부서</td><td>${emp.departmentName}{${emp.departmentId}}</td></tr>
</table>
<h4><a href="/hr/update/${emp.employeeId}">사원 정보 수정</a>&nbsp;
<a href="/hr/delete?empId=${emp.employeeId}">사원 정보삭제</a></h4>
</body>
</html>


