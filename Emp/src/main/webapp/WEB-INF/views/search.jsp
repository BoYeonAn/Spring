<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>
	부서번호 검색</h3>
	<form action="/hr/deptSearch">
	부서번호:<input type=text name=deptId><input type=submit value=검색>
	</form>
	<br><br>
	<h3>사원번호 검색</h3>
	<form action="/hr/empSearch">
	사원번호:<input type=text name=empId><input type=submit value=검색></form>


</body>
</html>