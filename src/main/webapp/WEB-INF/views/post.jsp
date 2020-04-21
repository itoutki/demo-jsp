<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Post</title>
</head>
<body>
<h1>Post</h1>
<p>Post result</p>
<table>
    <tr>
        <td>InputA</td>
        <td><c:out value="${sampleForm.inputA}" /></td>
    </tr>
    <tr>
        <td>InputB</td>
        <td><c:out value="${sampleForm.inputB}" /></td>
    </tr>
</table>
</body>
</html>
