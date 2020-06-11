<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		<c:out value="${pageContext.servletContext.contextPath}" />
	</p>
	<p>
		<c:url value="/test" />
	<p>
	
	<form>
	
	<label for="name">Name:</label>
	<input type="text" id="name" name="name" />
	
	<label for="password">Password:</label>
	<input type="password" id="password" name="password" />
	
	<input type="submit" value="Submit" />
	
	</form>
</body>
</html>