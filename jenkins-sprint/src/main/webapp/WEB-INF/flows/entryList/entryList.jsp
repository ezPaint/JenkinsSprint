<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>test-app</title>

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<br>
	<br>
	<div class="container">
		<div class="text-center">
			<form class="form-inline" action="${contextPath}/entryList" method="post">
				<div class="form-group">
					<input type="text" class="form-control" name="name">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name="number">
				</div>
				<button type="submit" class="btn btn-default">Add Entry</button>
			</form>

			<p>I made a chfjldsjfdjfkldajfkadslange in a push, v5</p>
		
		</div>
	</div>
</body>
</html>