<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome to UOM Registration Page</h2>
<form:form action="save" modelAttribute="uom">
<pre>
UserType :<form:radiobutton path="uomType" value="VENDER"/>vender
		  <form:radiobutton path="uomType" value="CUSTOMER"/>customer
UserCode :<form:input path="uomCode"/>
UserFor  :<form:select path="uomFor">
		  <form:option value="">--select--</form:option>
		  <form:option value="SALE">sale</form:option>
		  <form:option value="PURCHASE">purchase</form:option>
		  </form:select>	
UserEmail:<form:input path="uomEmail"/>
UserContact:<form:input path="uomContact"/>	
UserId Type :<form:select path="uomIdType">
			 <form:option value="">--select--</form:option>
			 <form:option value="PANCARD">Pancard</form:option>
			 <form:option value="AADHARCARD">Aadhar</form:option>
			 <form:option value="VOTERCARD">VoterId</form:option>
			 <form:option value="OTHER">other</form:option>
		     </form:select>
IdNumber :<form:input path="uomIdNumber"/>
<input type="submit" value="register"/> 
</pre>
${uomMsg}
</form:form>
<a href="show">view Data</a>
</body>
</html>