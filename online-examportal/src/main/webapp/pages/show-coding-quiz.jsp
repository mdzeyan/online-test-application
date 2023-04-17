<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.CodingQuestion"%> 
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h4>Welcome to Show all Coding Questions</h4>
	<hr>
	<%
	int count = 1;
	List<CodingQuestion> progQuestions = (List<CodingQuestion>)session.getAttribute("session");
	
	%>
	
	<%
	for(CodingQuestion qsn : progQuestions)
		{
	%>
	
	<h3><%=count%>. <%=qsn.getQcontent() %></h3>
	
	<%
	count++;
	}
	%>

</body>
</html>