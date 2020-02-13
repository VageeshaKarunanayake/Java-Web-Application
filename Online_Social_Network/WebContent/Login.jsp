<%@ page import="Database.login,java.net.URI,java.awt.Desktop" %>

<% 
	String email = request.getParameter("email");
	String PW = request.getParameter("pwd");
	String log = login.dbOutput(email, PW);
	
	if(log == null)
	{
		String redirectURL = "InvalidLogin.jsp";
		response.sendRedirect(redirectURL);
		 	 
	} 
	else
	{
		session.setAttribute("LogDetails",log);	
		String redirectURL = "ImagesWeb.jsp";
		response.sendRedirect(redirectURL);
		
	}
%>
