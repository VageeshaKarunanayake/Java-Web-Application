<html>
<head>
<link rel="stylesheet" href="Header/HeaderStyle_h.css">
</head>
<body>
<ul id="menu_wrap" class="Vista_Black"><li class="button"><a href="Home.jsp">Home</a></li><li class="button"><a href="ImagesWeb.jsp">Wall</a></li><li class="button"><a href="index.jsp">Friends</a></li><li class="button"><a href="chat.jsp">Message</a></li><li class="button"><a href="PostWeb.jsp">Posts</a></li><li class="button"><a href="SearchWeb.jsp">Search</a></li><li class="button" style="float:right"><a href="FirstWeb.jsp"><%=(String)session.getAttribute("LogDetails")%>(Logout)</a></li> </ul>
</body>
</html>