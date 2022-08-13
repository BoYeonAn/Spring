<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" ></script>
<title>Insert title here</title>
</head>
<body>
<div class="wrap"></div>
<script>
$(function()){
	$.ajax({
		url : "resources/json/MOCK_DATA.json",
		dataType :"json",
		success : function(data){
			if(data.length > 0){
				var tb=$("<table />");
				for(var i in data){
					var $id=data[i].id;
					var $first_name = data[i].first_name;
					var $last_name = data[i].last_name;
					var $email = data[i].email;
					var row = $("<tr/>").append(
							 $("<tr/>").text($id),
							 $("<tr/>").text($first_name),
							 $("<tr/>").text($last_name),
							 $("<tr/>").text($email)
					
							 );
					tb.append(row);
				}
				$(".wrap").append(tb); }}
	
	});
	
	
});

</script>


</body>
</html>