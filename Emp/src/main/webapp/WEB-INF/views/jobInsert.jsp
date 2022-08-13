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
<form action="/hr/job/insert" method="post">
<table>
<tr><td>직무id</td><td><input type="text" name="jobId"></td></tr>
<tr><td>직무이름</td><td><input type="text" name="jobTitle"></td></tr>
<tr><td><input type=submit value=저장><input type=reset value=취소></td></tr>

</table>
</form>
</body>
</html>
