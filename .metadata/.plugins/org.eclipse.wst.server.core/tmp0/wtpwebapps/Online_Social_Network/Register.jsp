<%@ page import="Database.register" %>
<html>
<body>
<% 
	String FN = request.getParameter("FN");
	String LN = request.getParameter("LN");
	String Gen = request.getParameter("Gen");
	String UN = request.getParameter("UN");
	String email = request.getParameter("email");
	String PW = request.getParameter("PW");
	int cn = Integer.parseInt(request.getParameter("cn"));

	register.dbInput(FN, LN, Gen, UN, email, PW, cn);
	
	String redirectURL = "LoginWeb.jsp";
	response.sendRedirect(redirectURL);
	
%>
</body>
</html>