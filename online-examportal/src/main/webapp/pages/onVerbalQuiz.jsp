<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.VerbalQuestion"%>
<%@page import="com.online.exam.entity.VerbalAnswer"%>  
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

	<form action="showVerbalResult" method="post">
	
		<%
	
		int num = 1;
		
		List<VerbalQuestion> questions = new ArrayList<VerbalQuestion>();
		questions = (List<VerbalQuestion>)session.getAttribute("objs");
	
		
		
		for(VerbalQuestion qsn :  questions)
		{
			List<VerbalAnswer> ans = qsn.getQanswers();
	%>
		
			<h3><%=num+" "%>.<%=qsn.getQcontent() %></h3>
			<input type="hidden" name="questionId" value="<%=qsn.getQid()%>">
			
			<%
			for(VerbalAnswer ans1 : ans)
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