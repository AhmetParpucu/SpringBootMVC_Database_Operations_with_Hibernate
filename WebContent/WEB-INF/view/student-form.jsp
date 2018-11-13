<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Student Recording</title>
</head>
<body>
	
	<div class="container">
		<div class="jumbotron">
			<h1>Add New Student</h1>
		</div>
		
		<div>
		<form:form class="form-horizantal" modelAttribute="student" action="saveStudent" method="POST">
			
			<form:hidden path="id"></form:hidden>
		
			<div class="form-group">
				<label for="adi" class="col-sm-10 control-label">Ogrenci Adi</label>
				<div>
					<form:input type="text" class="form-control" id="adi" placeholder="Adi" path="firstName"></form:input>
					<!-- Buradaki pathler Student.java'da bulunan alan adlarını karşılamaktadır, bu sayede burdan gelecek olan veri firsName değişkenine atanır.-->
				</div>
			</div>
				
			<div class="form-group">
				<label for="adi" class="col-sm-10 control-label">Ogrenci Soyadi</label>
				<div>
					<form:input type="text" class="form-control" id="soyadi" placeholder="Soyadi" path="lastName"></form:input>
				</div>
			</div>
				
			<div class="form-group">
				<label for="adi" class="col-sm-10 control-label">Ogrenci Email</label>
				<div>
					<form:input type="text" class="form-control" id="email" placeholder="Email" path="email"></form:input>
				</div>
			</div>
				
			<div class="form-group">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary">Kaydet</button>
				</div>
			</div>
		</form:form>
		</div>		
	</div>
	<br>
	<p>
		<a href="${pageContext.request.contextPath}/student/list">Ogrenci Listesine Geri Git</a>
	</p>
	
</body>
</html>







