<h2>A JSP page </h2>
<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<body>
    <spring:message code="test.label" arguments="${date}"/>
</body>
</html>