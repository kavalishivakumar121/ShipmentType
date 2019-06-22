<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update" modelAttribute="shipmentType">
 <pre>
 	Id :<form:input path="id" readonly="true"/>
	ShipmentMode :
 	<form:select path="shipmentMode">
 	<form:option value="">--select--</form:option>
 	<form:option value="AIR">Air</form:option>
 	<form:option value="TRUCK">Truck</form:option>
 	<form:option value="SHIP">Ship</form:option>
 	<form:option value="TRAIN">Train</form:option>
 	</form:select>
 	ShipmentCode :
 	<form:input path="shipmentCode"/>
 	EnableShipment :
 	<form:select path="enableShipment">
 	<form:option value="">--select--</form:option>
 	<form:option value="YES">Yes</form:option>
 	<form:option value="NO">NO</form:option>
 	</form:select>
 	ShipmentGrade :
 	<form:radiobutton path="shipmentGrade" value="A"/>A
 	<form:radiobutton path="shipmentGrade" value="B"/>B
 	<form:radiobutton path="shipmentGrade" value="C"/>C
 	Description :
 	<form:textarea path="note"></form:textarea>
 	<input type="submit" value="update">
 	</pre>
 	</form:form>
</body>
</html>