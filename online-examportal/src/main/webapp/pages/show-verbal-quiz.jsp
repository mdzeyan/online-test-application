<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.online.exam.entity.VerbalQuestion"%> 
<%@ page import="java.util.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Test Application</title>
</head>
<body>

	<h4>Welcome to Show all Verbal Questions</h4>
	<hr>
	
	<%
	
	int count = 1;
	List<VerbalQuestion> verbalQuestions = new ArrayList<VerbalQuestion>();
	verbalQuestions = (List<VerbalQuestion>)session.getAttribute("session");
	
	%>
	
	<%
	for(VerbalQuestion qsn : verbalQuestions)
	{
	%>
	
	<h4><%=count%>. <%=qsn.getQcontent() %></h4>
	
	<%
	count++;
	}
	%>
	

</body>
</html>