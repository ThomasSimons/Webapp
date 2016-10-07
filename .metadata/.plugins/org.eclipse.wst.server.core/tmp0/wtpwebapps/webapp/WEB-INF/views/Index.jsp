<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib 	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="page.index.title"/></title> 
</head>
<body>
<h1><fmt:message key="page.index.title"/></h1>
	<c:if test="${ not empty error}">
		<span style="color:red"><fmt:message key="${error}"/></span>
	</c:if>		
<br>
<c:url value="/hello" var="formURL"/>

<form method="post" action="${formURL}">
<label for="name">Name:</label>
<input id="name" type="text" name="name" value="${param.name}" />
<input type="submit" value="Send" />
<input type="hidden" name="action" value="send"/>
</form>

</body>
</html>