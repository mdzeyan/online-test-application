<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.User"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Test Application</title>

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
	 					<a href="#" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-area-chart" style="font-size:15px; "></i><span class="fs-6 ms-2 d-none d-sm-inline">Aptitude Quiz</span>
	 					</a>
	 					
	 					<li class="nav-item">
	 						<a href="show-apt-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Show all Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="add-apt-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Add Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="delete-apt-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Delet Qsn</span>
	 						</a>
	 					</li>
	 					
	 					
	 				</li>
	 				<li class="nav-item">
	 					<a href="#" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-bar-chart" style="font-size:15px;"></i><span class="fs-6 ms-2 d-none d-sm-inline">Coding Quiz</span>
	 					</a>
	 					
	 					
	 					<li class="nav-item">
	 						<a href="show-code-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Show all Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="add-code-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Add Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="delete-code-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Delet Qsn</span>
	 						</a>
	 					</li>
	 					
	 					
	 				</li>
	 				<li class="nav-item">
	 					<a href="#" class="nav-link text-white" aria-current="page">
	 					<i class="fa fa-line-chart" style="font-size:15px;"></i><span class="fs-6 ms-2 d-none d-sm-inline">Verbal Quiz</span>
	 					</a>
	 					
	 					
	 					<li class="nav-item">
	 						<a href="show-verb-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Show all Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="add-verbal-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Add Qsn</span>
	 						</a>
	 					</li>
	 					
	 					<li class="nav-item">
	 						<a href="delete-verbal-quiz" class="nav-link text-white" aria-current="page">
	 							<span class="fs-6 ms-2 d-none d-sm-inline"> Delet Qsn</span>
	 						</a>
	 					</li>
	 					
	 					
	 				</li>
	 			</ul>
	 		</div>
	 	</div>
	 	
	 	<!-- main contain -->
	 	
	 	<div class="p-3">
	 		<h4 class ="text-center">Welcome to Admin Profile</h4>
	 		<hr>
	 	</div>
	 	
	</div>
	</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>