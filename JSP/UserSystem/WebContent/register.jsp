<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery3.6.0.min.js"></script>
</head>
<body>
注册
	<form action="UserServlet" method="post">
	<input type="hidden" name="action" value="register">
		用户名：<input type="text" name="account" value="${account}"><br/>
		密码：<input type="text" name="pwd" value="${pwd}"><br/>
		性别：<input type="text" name="sex" value="${sex}"><br/>
		邮箱：<input type="text" name="email" value="${email}"><br/>
		<input type="submit" id="form">
	</form>
	<div></div>
	${msg}
</body>
<script>
	$(function(){
		var errorMsg;
		$("form").on("submit",function(){
			$("p").empty();
			var account = $("input:eq(0)").val().trim();
			var pwd = $("input:eq(1)").val().trim();
			var sex = $("input:eq(2)").val().trim();
			var email = $("input:eq(3)").val().trim();
			if(account == ""||pwd == ""||sex == ""||email == ""){
				errorMsg = "所有字段均为必填项，不能为空！";
				$("div").append("<p>"+errorMsg+"</p>");
				return false;
			}
			return true;
		});
	});
	
</script>
</html>