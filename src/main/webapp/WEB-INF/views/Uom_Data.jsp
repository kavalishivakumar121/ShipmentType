<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="excel">excel export</a><br>
<a href="pdf">pdF export</a><br>
<form:form action="update" modelAttribute="uom">
<table border="1">
<tr>
<th>Id</th>
<th>Type</th>
<th>Code</th>
<th>For</th>
<th>Email</th>
<th>Contact</th>
<th>UserIdType</th>
<th>IdNumber</th>
<th colspan="3">Operations</th>
</tr>
<c:forEach items="${uomlist}" var="ob">
<tr>
<td><c:out value="${ob.uomId}"></c:out></td>
<td><c:out value="${ob.uomType }"></c:out></td>
<td><c:out value="${ob.uomCode }"></c:out></td>
<td><c:out value="${ob.uomFor}"></c:out></td>
<td><c:out value="${ob.uomEmail}"></c:out></td>
<td><c:out value="${ob.uomContact}"></c:out></td>
<td><c:out value="${ob.uomIdType}"></c:out></td>
<td><c:out value="${ob.uomIdNumber}"></c:out></td>
<td><a href="delete?id=${ob.uomId}">Delete</a></td>
<td><a href="edit?id=${ob.uomId}">Edit</a>
<td><a href="view?id=${ob.uomId}">View</a></td>
</tr>
</c:forEach>
</table>
${message1}
</form:form>
${msg1}	
</body>
</html>