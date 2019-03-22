<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav">
				<h2>Contracts Managment</h2>
				<ul class="nav nav-pills nav-stacked">
					<li class="active"><a href="#section1">Active contracts</a></li>
					<li><a href="#section2">All contracts</a></li>
					<li><a href="#section3">Systems</a></li>
					<li><a href="#section3">About app</a></li>
				</ul>
				<br>

			</div>



			<div class="col-sm-9">

				<table class="table table-striped">
					<tr>
						<td><strong>Name</strong></td>
						<td><strong>technology</strong></td>
						<td><strong>sys desc</strong></td>
						<td><strong>Owner</strong></td>
					</tr>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.name}</td>
							<td>${user.technology}</td>
							<td>${user.description}</td>
							<td>${user.owner}</td>
						</tr>
					</c:forEach>
				</table>


			</div>
		</div>
	</div>

	<footer class="container-fluid">
		<p>Footer Text</p>
	</footer>

</body>
</html>
