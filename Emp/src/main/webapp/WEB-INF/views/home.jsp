<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인사 관리 시스템</title>
</head>
<body>
<H2>안녕하세요 환영합니다.</H2>
<a href="/hr/list"><button>1.목록조회</button></a><br>
<a href="/hr/search"><button>2.부서/사원번호 검색</button></a><br>
<a href="/hr/insert"><button>3.사원 정보 입력</button></a><br>
<a href="/hr/job/insert"><button>4.직무 정보 입력</button></a><br>
<a href="/hr/job/list"><button>5.직무 목록조회</button></a><br>
<a href="/hr/department"><button>6.부서 입력</button></a><br>
<a href="/hr/ajax"><button>7.ajax테스트</button></a><br>
</body>
</html>