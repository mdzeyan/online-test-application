<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.AptiQuestion"%> 
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Test Application</title>
</head>
<body>

	<h2>Welcome to Show all Aptitude Questions</h2>
	<hr>
	
	<%
	
	int count = 1;
	List<AptiQuestion> aptiQuestions = (List<AptiQuestion>)session.getAttribute("session");
	
	%>
	
	<%
	
	for(AptiQuestion qsn : aptiQuestions)
	{
	%>
	
	<h3><%=count%>. <%=qsn.getQcontent() %></h3>
	
	<%
	count++;
	}
	%>
	
	
	
	
	

</body>
</html>