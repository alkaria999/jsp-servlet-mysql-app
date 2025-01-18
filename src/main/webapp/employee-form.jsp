<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: gray;">
			<div>
				<a href="<%=request.getContextPath()%>/list" class="navbar-brand">
					Employee Management App </a>
			</div>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${employee != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${employee == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${employee != null}">
            			Edit Employee
            		</c:if>
						<c:if test="${employee == null}">
            			Add New Employee
            		</c:if>
					</h2>
				</caption>

				<c:if test="${employee != null}">
					<input type="hidden" name="id"
						value="<c:out value='${employee.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Name</label> <input type="text"
						value="<c:out value='${employee.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Age</label> <input type="text"
						value="<c:out value='${employee.age}' />" class="form-control"
						name="age">
				</fieldset>

				<fieldset class="form-group">
					<label>Gender</label> <input type="text"
						value="<c:out value='${employee.gender}' />" class="form-control"
						name="gender">
				</fieldset>

				<fieldset class="form-group">
					<label>Department</label> <input type="text"
						value="<c:out value='${employee.department}' />"
						class="form-control" name="dept">
				</fieldset>

				<fieldset class="form-group">
					<label>Joining Year</label> <input type="text"
						value="<c:out value='${employee.yearOfJoining}' />"
						class="form-control" name="joiningYear">
				</fieldset>

				<fieldset class="form-group">
					<label>Salary</label> <input type="text"
						value="<c:out value='${employee.salary}' />" class="form-control"
						name="salary">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
