<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직무 정보 입력</title>
</head>
<body>
<h2>직무 목록</h2>
<table>
<tr><td>직무id</td></tr>
<tr><td>직무이름</td></tr>
<c:forEach var="job" items="${jobList}">

<tr>
<td><a href="/hr/jobInfo/${job.jobId}">${job.jobId}</a></td>
<td>${job.jobTitle}</td>
</tr>
</c:forEach>



</body>
</html>