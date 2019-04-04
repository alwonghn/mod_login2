<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form:form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post">
		<h2 class="form-heading">Login Page</h2>
		<span>${message}</span>
		<form:label path="username">Username: </form:label>
		<form:input path="username" />
		<form:label path="password">Password:</form:label>
		<form:password path="password" />
		<span>${error}</span>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>