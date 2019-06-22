<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="excel">export excel</a>
<form:form action="update" modelAttribute="shipmentType">

<table border="1">
<tr>
	<th>Id</th>
	<th>mode</th>
	<th>code</th>
	<th>grade</th>
	<th>note</th>
	<th colspan="3">operations</th>
	</tr>
<c:forEach items="${list}" var="ob">
<tr>
	<td><c:out value="${ob.id}"/> </td>
	<td><c:out value="${ob.shipmentMode }"/> </td>
	<td><c:out value="${ob.shipmentCode}"/> </td>
	<td><c:out value="${ob.shipmentGrade }"/> </td>
	<td><c:out value="${ob.note}"/> </td>
	<td><a href="delete?id=${ob.id} ">delete</a></td>
	<td><a href="edit?id=${ob.id}">Edit</a></td>
	<td><a href="view?id=${ob.id}">View</a></td>
	
</tr>
<tr>
	<td>
	</td>
</tr>
</c:forEach>
</table>
${msg} 
</form:form>
</body>
</html>