<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>unichat</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Google-Style-Login.css">
    <link rel="stylesheet" href="assets/css/index.css">
    <link rel="stylesheet" href="assets/css/login.css">
</head>

<body id="indexb">
    <div class="login-card" style="margin-top:10%;"><img src="assets/img/avatar_2x.png" class="profile-img-card">
        <p class="profile-name-card"> </p>
        <form class="form-signin" name="Login" method="POST" action="Login.jsp">
        <span class="reauth-email"> </span>
        
        <input class="form-control" type="email" required="" placeholder="Email address" autofocus="" id="inputEmail" name="email">
        <input class="form-control" type="password" required="" placeholder="Password" id="inputPassword" name="pwd">
            
            <div class="checkbox">
            <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-1"></div>
    		</div>
    
    <button class="btn btn-primary btn-block btn-lg btn-signin" type="submit">Sign in</button>
    </form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>