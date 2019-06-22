<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to Shipment One Object Page...!</h3>
<form:form action="#" modelAttribute="shipmentType">
<table border="1">
<tr>
<th>Id</th>
<td>${v1.id}</td>
</tr>
<tr>
<th>Mode</th>
<td>${v1.shipmentMode}</td>
</tr>
<tr>
<th>Code</th>
<td>${v1.shipmentCode}</td>
</tr>
<tr>
<th>Enable</th>
<td>${v1.enableShipment}</td>
</tr>
<tr>
<th>Grade</th>
<td>${v1.shipmentGrade}</td>
</tr>
<tr>
<th>Note</th>
<td>${v1.note}</td>
</tr>

</table>
<table border=1>
<tr>
<td><a href="delete?id=${v1.id} ">Delete From Here</a></td>
<td><a href="edit?id=${v1.id} ">Edit From Here</a></td>
	
</tr>
</table>
</form:form>
</body>
</html>