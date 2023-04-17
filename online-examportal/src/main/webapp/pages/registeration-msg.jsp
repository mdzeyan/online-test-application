<%@page import="org.springframework.web.servlet.config.MvcNamespaceHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.online.exam.entity.User"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		User user = new User();
	    String message = (String) session.getAttribute("msg");
		String message1 = (String) session.getAttribute("msg1");
		String message2 = (String) session.getAttribute("msg2");
		
		if(message != null)
		{
			
	%>
			
		<div class="alert alert-success alert-dismissible fade show" role="alert">
	  		<strong><%=message %></strong>
	  		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
	    	<span aria-hidden="true">&times;</span>
	  		</button>
	  		<a href="login">Go to Login Page</a>
		</div>
		
		
	<%
	
			session.removeAttribute("msg");
		
		}
		
		else if(message1 != null)
		{
	%>
		<div class="alert alert-success alert-dismissible fade show" role="alert">
	  		<strong><%=message1 %></strong>
	  		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
	    	<span aria-hidden="true">&times;</span>
	  		</button>
	  		<a href="registration">Register Again</a>
		</div>
			
	<%
		
		session.removeAttribute("msg1");
	
		}
		
		else if(message2 != null)
		{
			
	%>
	
	<div class="alert alert-success alert-dismissible fade show" role="alert">
	  		<strong><%=message2 %></strong>
	  		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
	    	<span aria-hidden="true">&times;</span>
	  		</button>
	  		<a href="registration">Register Again</a>
	</div>
	
	<%
	
	session.removeAttribute("msg2");
			
		}
	%>
	







	

</body>
</html>