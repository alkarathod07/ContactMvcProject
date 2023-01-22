<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.bikkkadIT.com</title>
</head>
<body bgcolor="pink">
<h3 > save contact Here</h3>

<font color='green' > ${success} </font>
<font color='red' > ${error} </font>


<form:form action="saveContact?contactid=${contact.contactid}" 
 modelAttribute="contact" method="POST">


<table >
<tr>
<td>Contact Name</td>
<td><form:input path="conatactname"/></td>
</tr>

<tr>
<td>Contact Email</td>
<td><form:input path="contactemail"/></td>
</tr>

<tr>
<td>Contact Number</td>
<td><form:input path="contactnumber"/></td>
</tr>

<tr>
<td><input type="submit"  value="Save"/></td>
</tr>


</table>
<a href="viewContacts">View All Contacts</a>
</form:form>
</body>
</html>