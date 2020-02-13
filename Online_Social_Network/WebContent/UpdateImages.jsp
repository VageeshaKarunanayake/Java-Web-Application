<%@ page import="Database.images,java.io.*,java.text.*,java.util.*" %>
<html>
<body>
<% 	String[] Images = request.getParameterValues("Images");
	String[] DelImages = request.getParameterValues("DelImages");
	String UN = (String)session.getAttribute("LogDetails");
	
		
	if(Images != null)
	{
	for(String Img : Images)
	{
		images.UploadImg(UN, Img);
	}
	}
	
	if(DelImages != null)
	{
		for(String DelImg : DelImages )
		{
			images.DeleteImg(UN, DelImg);
		}
		
	}
		String redirectURL = "UpdateImagesWeb.jsp";
		response.sendRedirect(redirectURL);
	%>
</body>
</html>