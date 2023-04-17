<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.online.exam.entity.CodingQuestion"%>
<%@page import="com.online.exam.entity.CodingAnswer"%>  
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


	<form action="showCodingResult" method="post">
	
		<%
	
		int num = 1;
		
		List<CodingQuestion> questions = new ArrayList<CodingQuestion>();
		questions = (List<CodingQuestion>)session.getAttribute("objs");
	
		
		
		for(CodingQuestion qsn :  questions)
		{
			List<CodingAnswer> ans = qsn.getQanswers();
	%>
		
			<h3><%=num+" "%>.<%=qsn.getQcontent() %></h3>
			<input type="hidden" name="questionId" value="<%=qsn.getQid()%>">
			
			<%
			for(CodingAnswer ans1 : ans)
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