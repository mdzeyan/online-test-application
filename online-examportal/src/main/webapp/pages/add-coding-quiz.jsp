<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Test Application</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


</head>
<body>

	<%@include file = "normal-user-navbar.jsp"%>
	<div class="container">
		
		<h4>Welcome to Coding Page</h4>
		<hr>
		
	<form action="addCodingQuestion" method="get">
 		
 		<label>Question</label>
 		<input required type="text" name="question">
 		<br>
 		<label>Answer1</label>
 		<input required type="text" name="answer1">
 		<input required type="radio" name="isCorrect1" value="false">false
 		<input required type="radio" name="isCorrect1" value="true">true
 		<br>
 		<label>Answer2</label>
 		<input required type="text" name="answer2">
 		<input required type="radio" name="isCorrect2" value="false">false
 		<input required type="radio" name="isCorrect2" value="true" >true
 		<br>
 		<label>Answer3</label>
 		<input required type="text" name="answer3">
 		<input required type="radio" name="isCorrect3" value="false">false
 		<input required type="radio" name="isCorrect3" value="true" >true
 		
 		<br>
 		
 		<input type="submit" value="Submit">
 		
 	</form> 
		
	</div>
	
	

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


</body>
</html>