<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>post</title>
    <link rel="stylesheet" href="Post/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="Post/css/newchat.css">
    <jsp:include page="Header.jsp" />
</head>

<body id="newchat">
    <div class="jumbotron" id="newchat-jumb">
    	<form method="post" action="Post.jsp">
        <h1>Write a Post.....</h1><textarea id="newpost-content" name="post"></textarea>
        <p><button class="btn btn-primary" type="submit">UPLOAD POST</button>
        <button class="btn btn-primary" type="reset">DELETE POST</button></p>
    </form>
    </div>
    <script src="Post/js/jquery.min.js"></script>
    <script src="Post/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>