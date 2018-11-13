<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Student List</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
	  		<h1>Ogrenci Sistemine Hosgeldiniz</h1>
	  		<a class="btn btn-primary btn-lg" role="button" type="button" onclick="window.location.href='showStudentForm'; return false;">Ogrenci Ekle</a>
		</div>
		<div>
			<table class="table table-striped">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Adress</th>
					<th>Uptade/Delete</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${students}"> <!-- StudentController.java'dan gelen verilerin çağrıldığı yer -->
					<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.email}</td>
						<td><a class="btn btn-warning" href="${pageContext.request.contextPath}/student/showFormForUpdate?studentID=${tempStudent.id}">Update</a>
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/student/deleteStudent?studentID=${tempStudent.id}"
						onclick="if(!(confirm('Are you sure you want to delete this student ?'))) return false;">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>






