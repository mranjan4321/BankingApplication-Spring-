<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account List By City</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div
		style="height: 730px; width: 850px; text-align: left; padding-left: 45px">
		<h2>Active ACCOUNT  DETAILS</h2>
		<hr>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Account Number</th>
					<th scope="col">Account Holder Name</th>
					<th scope="col">Account Type</th>
					<th scope="col">IFSC Code</th>
					<th scope="col">Account Branch</th>
					<th scope="col">Account City</th>
					<th scope="col">Account Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="acc" items="${accList}">
					<tr>
						<td>${acc.accnumber}</td>
						<td>${acc.accname}</td>
						<td>${acc.acctype}</td>
						<td>${acc.accifsc}</td>
						<td>${acc.accbranch}</td>
						<td>${acc.acccity}</td>
						<td>${acc.accstatus}</td>
						<td><a class="btn btn-primary" href="updateProduct/${acc.accnumber}" role="button">Update</a>
							<a class="btn btn-danger" href="deleteProduct/${acc.accnumber}" role="button">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="back">HOME PAGE</a>
		
		
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>