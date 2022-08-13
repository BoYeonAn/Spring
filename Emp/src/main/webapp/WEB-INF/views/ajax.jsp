<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" ></script>
</head>
<body>
<span id=ajaxarea>ajax값</span>
<br>
<button id=ajax>ajax 실행</button>
<script>
$("#ajax").click("on",function(){
	$.ajac({
		url : "example",
		type : "get",
		data: {userId :"gtserf"},
		dataType: "text",
		success : function(result){
			$("#ajaxarea").text(result);
		},
		error : function(e){
			console.log(e.statusText);
		}
	});
	
	
	
	
	/* var xhr=new XMLHttpRequest();
	var setAra=function(word){
		document.getElementById("ajaxarea").innerText=word;
	}
	
xhr.open('get', 'example?userId=gctserf');
xhr.setReqeustHeader("content-type", "application/json");
xhr.send();
xhr.onreadystatechange=function(){
	if(xhr.readyState===xhr.DONE){
	if(xhr.status===200 || xhr.status === 201){
		setArea(xhr.responseText);
	}
	}
} */
});



</script>

</body>
</html>