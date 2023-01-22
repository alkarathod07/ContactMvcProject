<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.bikkadit.com</title>

<script>
	function confirmDelete() {
		return confirm("Are you sure you want to delete?");
	}
</script>

</head>
<body bgcolor="pink">

	<h1>View All Contacts</h1>

	<table border="5">


		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Number</th>
		</tr>


		<tbody>
			<c:forEach items="${contact}" var="cot">


				<tr>

					<td>${cot.conatactname}</td>
					<td>${cot.contactemail}</td>
					<td>${cot.contactnumber}</td>
					<td><a href="edit?contactid=${cot.contactid}">Edit</a> <a
						href="delete?contactid=${cot.contactid}"
						onclick=" return confirmDelete()">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>



</body>
</html>