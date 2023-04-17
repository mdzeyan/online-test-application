<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.AptiQuestion"%>
<%@page import="com.online.exam.entity.AptiAnswer"%>  
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Ongoing Quiz</h3>
<hr>


	<form action="showAptiResult" method="post">
	
		<%
	
		int num = 1;
		
		List<AptiQuestion> questions = new ArrayList<AptiQuestion>();
		questions = (List<AptiQuestion>)session.getAttribute("objs");
	
		
		
		for(AptiQuestion qsn :  questions)
		{
			List<AptiAnswer> ans = qsn.getQanswers();
	%>
		
			<h3><%=num+" "%>.<%=qsn.getQcontent() %></h3>
			<input type="hidden" name="questionId" value="<%=qsn.getQid()%>">
			
			<%
			for(AptiAnswer ans1 : ans)
			{
			%>
				
				<input required type="radio" name="question_<%=qsn.getQid()%>" value="<%=ans1.getAid()%>"><%=ans1.getAcontent()%>
					
			<%
			}
			%>
	
	<%
	num++;
		}
	
	%>
		<br>
		<br>
		<input type="submit" value="Submit and Finish">
	</form>

</body>
</html>