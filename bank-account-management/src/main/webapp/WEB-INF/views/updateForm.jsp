<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<div
		style="height: 730px; width: 550px; text-align: left; padding-left: 45px">
		<h2>Update ACCOUNT</h2>
		<hr>
		<form action="/addAccount" method="post">
			<div class="mb-3">
				<label class="form-label">Account Number </label> <input type="text"
					class="form-control" name="num">
			</div>
			<div class="mb-3">
				<label class="form-label">Account Holder Name </label> <input
					type="text" class="form-control" name="name">
			</div>
			<div class="mb-3">
				<label class="form-label">Account Type </label>
				<select name="type">
				<option>saving</option>
				<option>salary</option>
				</select>
			</div>
			<div class="mb-3">
				<label class="form-label">IFSC Code </label> <input type="text"
					class="form-control" name="ifsc">
			</div>
			<div class="mb-3">
				<label class="form-label">Branch </label> <input type="text"
					class="form-control" name="branch">
			</div>
			<div class="mb-3">
				<label class="form-label">City </label> <input type="text"
					class="form-control" name="city">
			</div>
			<div class="mb-3">
				<label>Status </label> 
				Active:<input type="radio" name="status" value="active"> 
					InActive:<input type="radio" name="status" value="inactive">
			</div>

			<button type="submit" class="btn btn-primary">Update</button>
		</form>
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