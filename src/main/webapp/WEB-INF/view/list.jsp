<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>生日</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.sid }</td>
				<td>${s.sname }</td>
				<td>${s.sex }</td>
				<td>${s.birthday }</td>
				<td>
				
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>