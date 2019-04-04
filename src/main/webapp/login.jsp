<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<body>
    <div class="container">
		<form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post" class="form-signin">
			<h2 class="form-heading">Login Page</h2>
			<span>${message}</span><br/>
			<form:label path="username" >Username: </form:label>
			<form:input path="username"  class="form-control"/>
			<form:label path="password">Password:</form:label>
			<form:password path="password"  class="form-control"/>
			<input type="submit" value="Submit" />
		</form:form>
    </div>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>