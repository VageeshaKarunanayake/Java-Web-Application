<%@ page import="Database.images,java.util.*" %>
<!DOCTYPE html>
<html class="no-js">
	<head>
	<jsp:include page="Header.jsp" />
	<link rel="stylesheet" href="ImagesPage/css/animate.css">
	<link rel="stylesheet" href="ImagesPage/css/icomoon.css">
	<link rel="stylesheet" href="ImagesPage/css/magnific-popup.css">
	<link rel="stylesheet" href="ImagesPage/css/salvattore.css">
	<link rel="stylesheet" href="ImagesPage/css/style.css">
	<link rel="stylesheet" href="ImagesPage/css/Button.css">
	</head>
	<body>
	
	<button class="myButton" type="submit" style="float: right; margin-right: 150px;" onclick="location.href='UpdateImagesWeb.jsp';"><b>Update</b></button>
			
			
	<div id="fh5co-main">
		<div class="container">

			<div class="row">

        <div id="fh5co-board" data-columns>

        	
        	<% String email = (String)session.getAttribute("LogDetails"); 
			ArrayList<String> ImgSet = images.GetImg(email);
			ArrayList<String> NumSet = images.GetNum(email);
			ArrayList<String> DaTiSet = images.GetDaTi(email);
			ArrayList<String> SizeSet = images.GetSize(email);
				for(int i = 0; i < ImgSet.size();i++) {%>
        	<div class="item">
        		<div class="animate-box">
        			<a href="<%=ImgSet.get(i) %>" class="image-popup fh5co-board-img"><img src="<%=ImgSet.get(i) %>"></a>
					<div class="fh5co-desc">Image No :- <%=NumSet.get(i) %><br>Image Size :- <%=SizeSet.get(i) %> KB<br>Modified Date :- <%=DaTiSet.get(i) %><br></div>        		
        		</div>
        	</div> <% }%>
        	
			
			
        </div>
        </div>
       </div>
	</div>
	
	<script src="ImagesPage/js/jquery.min.js"></script>
	<script src="ImagesPage/js/jquery.waypoints.min.js"></script>
	<script src="ImagesPage/js/jquery.magnific-popup.min.js"></script>
	<script src="ImagesPage/js/salvattore.min.js"></script>
	<script src="ImagesPage/js/main.js"></script>

</body>
</html>
