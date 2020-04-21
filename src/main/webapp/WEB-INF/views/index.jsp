<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Index</title>
</head>
<body>
<h1>JSP Index</h1>
<p>Hello world!</p>
<form:form modelAttribute="sampleForm"
           action="${pageContext.request.contextPath}/post">
    <form:label path="inputA">Input1</form:label>
    <form:input path="inputA" />
    <form:errors path="inputA" />
    <br>
    <form:label path="inputB">Input2</form:label>
    <form:input path="inputB" />
    <form:errors path="inputB" />
    <br>
    <input type="submit" name="confirm" value="Confirm" /> <!-- (1) -->
</form:form>
</body>
</html>
