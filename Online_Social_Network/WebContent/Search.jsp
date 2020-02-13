<%@ page import="Database.search,java.sql.*,java.util.*" %>
<html>
<body>
<% 
	String se = request.getParameter("Search");
	ArrayList<String> searchlist; 
	searchlist = search.dbSearch(se);
	 session.setAttribute("searchlist",searchlist); 
	String redirectURL = "SearchWebFinal.jsp";
	response.sendRedirect(redirectURL);
%>
