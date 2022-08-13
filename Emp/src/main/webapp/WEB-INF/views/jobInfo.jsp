<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직무 상세 정보 페이지</title>
</head>
<body>
<h2>직무상세정보</h2>
<table>
<tr><td>직무ID</td><td>${job.jobId}</td></tr>
<tr><td>직무이름</td><td>${job.jobTitle}</td></tr>
<tr><td>최소급여</td><td>${job.minSalary}</td></tr>
<tr><td>최대급여</td><td>${job.maxSalary}</td></tr>
</table>직무
</body>
</html>
