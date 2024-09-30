<%@page import="com.edu.seiryo.entity.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>性别</td>
			<td>邮箱</td>
			<td>操作</td>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.account}</td>
				<td>${user.password}</td>
				<td>${user.sex}</td>
				<td>${user.email}</td>
				<td><a href="EditServlet?opt=edit&id=${user.id}">编辑</a>&nbsp;<a href="EditServlet?opt=delete&id=${user.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	${msg}
</body>
</html>