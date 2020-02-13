<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>unichat</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
    <link rel="stylesheet" href="assets/css/KD_Header2.css">
    <link rel="stylesheet" href="assets/css/findfriend.css">
    <link rel="stylesheet" href="assets/css/Header-1.css">
    <link rel="stylesheet" href="assets/css/header.css">
    <link rel="stylesheet" href="assets/css/header2.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/index.css">
    <link rel="stylesheet" href="assets/css/Google-Style-Login.css">
    <link rel="stylesheet" href="assets/css/KD_Header1.css">
    <link rel="stylesheet" href="assets/css/KD_Header.css">
    <link rel="stylesheet" href="assets/css/Pretty-Search-Form.css">
    <link rel="stylesheet" href="assets/css/Pretty-Header.css">
    <link rel="stylesheet" href="assets/css/Pretty-Registration-Form.css">
    <link rel="stylesheet" href="assets/css/login.css">
    <link rel="stylesheet" href="assets/css/register.css">
    <jsp:include page="Header.jsp" />
</head>

<body id="findfriend-body">
    
    <form id="header2-search" class="search-form">
        <div class="input-group">
            <div class="input-group-prepend"></div>
            <div class="input-group-append"></div>
        </div>
    </form>
    <form class="search-form" method="get" action="Search.jsp" >
        <div class="input-group">
            <div class="input-group-prepend"><span class="input-group-text"><i class="fa fa-search"></i></span></div><input class="form-control" type="text" placeholder="I am looking for.." name="Search" style="color:rgb(11,112,188);">
            <div class="input-group-append"><button class="btn btn-primary" type="submit">Search </button></div>
        </div>
    </form>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>
</html>