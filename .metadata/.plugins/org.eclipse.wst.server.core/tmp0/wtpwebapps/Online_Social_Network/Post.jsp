<%@ page import="Database.posts" %>
<% 
	String post = request.getParameter("post");
	String email = (String)session.getAttribute("LogDetails");
	
	posts.setpost(email, post);

%>