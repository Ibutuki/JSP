<%@page import="com.edu.seiryo.entity.Users"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="com.edu.seiryo.entity.Users"></jsp:useBean>
<% Users user = (Users)request.getAttribute("user"); %>
	<form method="post" action="EditServlet?opt=update">
		<input type="text" name="id" value="<c:out value="${userBean.id}"/>" readonly><br/>
		<input type="text" name="account" value="<c:out value="${userBean.account}"/>"><br/>
		<input type="text" name="pwd" value="<c:out value="${userBean.password}"/>"><br/>
		<input type="text" name="sex" value="<c:out value="${userBean.sex}"/>"><br/>
		<input type="text" name="email" value="<c:out value="${userBean.email}"/>"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>