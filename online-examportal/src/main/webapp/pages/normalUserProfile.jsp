<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page import="com.online.exam.entity.User"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!--css-->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

	<%
		User user = new User();
		user = (User)session.getAttribute("session");
	%>
	
	
	<style>
	
		.nav-pills li a:hover{
		background-color:DodgerBlue;
		}
	
	</style>

	 <%@include file = "normal-user-navbar.jsp"%>
	 
	 
	 <div class="container-fluid">
	 <div class="row flex-nowrap">
	 	<div class="bg-dark col-auto col-md-2 min-vh-100">
	 		<div class="bg-dark p-2">
	 			<a class="d-flex text-decoration-none mt-1 align-items-center text-white">
	 				<i class="fs-5 fa fa-guage"></i><span class="fs-4 d-none d-sm-inline">SideMenu</span>
	 			</a>
	 			<ul class="nav nav-pills flex-column mt-4">
	 				<li class="nav-item">
	 					<a href="onAptiQuiz" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-area-chart" style="font-size:15px; "></i><span class="fs-6 ms-2 d-none d-sm-inline">Aptitude Quiz</span>
	 					</a>
	 				</li>
	 				<li class="nav-item">
	 					<a href="onCodingQuiz" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-bar-chart" style="font-size:15px;"></i><span class="fs-6 ms-2 d-none d-sm-inline">Coding Quiz</span>
	 					</a>
	 				</li>
	 				<li class="nav-item">
	 					<a href="onVerbalQuiz" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-line-chart" style="font-size:15px;"></i><span class="fs-6 ms-2 d-none d-sm-inline">Verbal Quiz</span>
	 					</a>
	 				</li>
	 			</ul>
	 		</div>
	 	</div>
	 	
	 	<!-- main contain -->
	 	
	 	<div class="">
	 		<h4 class ="text-center">Instructions for Exam!</h4>
	 		<hr>
	 		<div>
	 			<h5>Important Instructions</h5>
	 			<br>
	 			<ul>
	 				<li>This Quiz only for practice purpose.</li>
	 				<li>You can attempt the quiz any number of time.</li>
	 				<li>There are 5 to 10 Questions in this quiz.</li>
	 				<li>Each questions carries 1 marks No negative for wrong ones.</li>
	 				<li>All questions is of MCQ Types.</li>
	 			</ul>
	 			<br>
	 			<hr>
	 			<h5>Attempting Quiz</h5>
	 			<br>
	 			<ul>
	 				<li>Click Aptitude Quiz, Coding Quiz or Verbal Quiz on sidebar to start the quiz.</li>
	 				<li>Scroll downl to move to next question.</li>
	 				<li>Click on Submit Button on completion of the quiz.</li>
	 				<li>Report of the test is automatically generated after submission the test.</li>
	 			</ul>
	 		</div>
	 	</div>
	 	
	</div>
	</div>







<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>