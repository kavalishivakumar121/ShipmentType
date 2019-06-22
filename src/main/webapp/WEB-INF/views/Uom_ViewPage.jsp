<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome to view Page!!</h2>
<table border="1">
<tr>
<th>Id</th>
<td>${v1.uomId}</td>
</tr>
<tr>
<th>Type</th>
<td>${v1.uomType}</td>
</tr>
<tr>
<th>Code</th>
<td>${v1.uomCode}</td>
</tr>
<tr>
<th>For</th>
<td>${v1.uomFor}</td>
</tr>
<tr>
<th>Email</th>
<td>${v1.uomEmail}</td>
</tr>
<tr>
<th>Contact</th>
<td>${v1.uomContact}</td>
</tr>
<tr>
<th>IdType</th>
<td>${v1.uomIdType}</td>
</tr>
<tr>
<th>IdNumber</th>
<td>${v1.uomIdNumber}</td>
</tr>
</table>

</body>
</html>