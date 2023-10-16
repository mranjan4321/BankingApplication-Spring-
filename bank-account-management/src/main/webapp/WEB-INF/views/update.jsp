<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<div style="height: 730px; width: 550px; text-align: left; padding-left: 45px">
		<h2>UPDATE PRODUCT</h2>
		<hr>
		<form action="/updateProduct" method="post">
			<div class="mb-3">
				<label class="form-label">ID </label> <input type="text"
					class="form-control" name="id" value="${product.id}">
			</div>
			<div class="mb-3">
				<label class="form-label">Name </label> <input type="text"
					class="form-control" name="name" value="${product.name}">
			</div>
			<div class="mb-3">
				<label class="form-label">Description </label> <input type="text"
					class="form-control" name="desc" value="${product.desc}">
			</div>
			<div class="mb-3">
				<label class="form-label">Price </label> <input type="text"
					class="form-control" name="price" value="${product.price}">
			</div>

			<button type="submit" class="btn btn-primary">Update</button>
		</form>
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