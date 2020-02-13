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
</head>

<body id="reg-body">
    <div class="jumbotron" id="reg-jumb"><img src="assets/img/5b642fb0-0c06-419c-805a-b2e79d065746.png" id="reg-head-img">
        <h1 id="reg-pic-head">One Place. All of us.!</h1>
    </div>
    <div class="row register-form">
        <div class="col-md-8 offset-md-2 offset-lg-2">
            <form class="custom-form" method="post" action="Register.jsp">
                <h1>Register Form</h1>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">First Name</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="FN"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Last Name</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="LN"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="dropdown-input-field">Gender</label></div>
                    <div class="col-sm-4 input-column"><input type="radio" name="Gen" value="Male"> Male &emsp;<input type="radio" name="Gen" value="Female"> Female</div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Username</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="UN"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="email-input-field">Email </label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="email" name="email"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Contact Number</label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="text" name="cn"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="pawssword-input-field">Password </label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="password" name="PW"></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="repeat-pawssword-input-field">Repeat Password </label></div>
                    <div class="col-sm-6 input-column"><input class="form-control" type="password"></div>
                </div><button class="btn btn-light submit-button" type="submit" data-bs-hover-animate="pulse">Submit Form</button><button class="btn btn-secondary submit-button" type="reset" data-bs-hover-animate="pulse">Reset Form</button></form>
        </div>
    </div>

    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>
