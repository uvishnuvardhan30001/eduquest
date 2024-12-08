<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Signup</title>

    <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
    <meta name="robots" content="noindex">

    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&display=swap" rel="stylesheet">

    <!-- Perfect Scrollbar -->
    <link type="text/css" href="assets/vendor/perfect-scrollbar.css" rel="stylesheet">

    <!-- Material Design Icons -->
    <link type="text/css" href="assets/css/material-icons.css" rel="stylesheet">

    <!-- Font Awesome Icons -->
    <link type="text/css" href="assets/css/fontawesome.css" rel="stylesheet">

    <!-- Preloader -->
    <link type="text/css" href="assets/vendor/spinkit.css" rel="stylesheet">

    <!-- App CSS -->
    <link type="text/css" href="assets/css/app.css" rel="stylesheet">

</head>

<body class="login">

    <div class="d-flex align-items-center" style="min-height: 100vh">
        <div class="col-sm-8 col-md-6 col-lg-4 mx-auto" style="min-width: 300px;">
            <div class="text-center mt-5 mb-1"></div>
            <div class="d-flex justify-content-center mb-5 navbar-light">
                <a href="instructor-dashboard.html" class="navbar-brand m-0">EduQuest</a>
            </div>
            <div class="card navbar-shadow">
                <div class="card-header text-center">
                    <h4 class="card-title">Sign Up</h4>
                    <p class="card-subtitle">Create a new account</p>
                </div>

                <form action="insertinstructor" novalidate method="post">
                    <div class="form-group">
                        <label class="form-label" for="iname">Name:</label>
                        <div class="input-group input-group-merge">
                            <input id="iname" name="iname" type="text" required class="form-control" placeholder="Your first and last name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="iemail">Email address:</label>
                        <div class="input-group input-group-merge">
                            <input id="iemail" name="iemail" type="email" required class="form-control" placeholder="Your email address">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ipwd">Password:</label>
                        <div class="input-group input-group-merge">
                            <input id="ipwd" name="ipwd"type="password" required class="form-control" placeholder="Choose a password">
                        </div>
                    </div>

                    <!-- New Fields -->
                    <div class="form-group">
                        <label class="form-label" for="igender">Gender:</label>
                        <div class="input-group">
                            <input type="radio" id="male" name="igender" value="male" required>
                            <label for="male">Male</label>
                            <input type="radio" id="female" name="igender" value="female" required>
                            <label for="female">Female</label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="form-label" for="idob">Date of Birth:</label>
                        <div class="input-group">
                            <input type="date" id="idob" name="idob" class="form-control" required>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="form-label" for="icontact">Contact Number:</label>
                        <div class="input-group">
                            <input id="icontact" type="tel" name="icontact" required class="form-control" placeholder="Enter your contact number">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="form-label" for="igraduation">Graduation:</label>
                        <div class="input-group">
                            <select id="igraduation" name="igraduation" class="form-control" required>
                                <option value="btech">B.Tech</option>
                                <option value="mtech">M.Tech</option>
                                <option value="phd">PhD</option>
                            </select>
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary btn-block mb-3">Sign Up</button>
                    <div class="form-group text-center mb-0">
                        <div class="custom-control custom-checkbox">
                            <input id="terms" type="checkbox" class="custom-control-input" checked required="">
                            <label for="terms" class="custom-control-label text-black-70">I agree to the <a href="#" class="text-black-70" style="text-decoration: underline;">Terms of Use</a></label>
                        </div>
                    </div>
                </form>
            </div>
            <div class="card-footer text-center text-black-50">Already signed up? <a href="instructorlogin">Login</a></div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="assets/vendor/jquery.min.js"></script>

    <!-- Bootstrap -->
    <script src="assets/vendor/popper.min.js"></script>
    <script src="assets/vendor/bootstrap.min.js"></script>

    <!-- Perfect Scrollbar -->
    <script src="assets/vendor/perfect-scrollbar.min.js"></script>

    <!-- MDK -->
    <script src="assets/vendor/dom-factory.js"></script>
    <script src="assets/vendor/material-design-kit.js"></script>

    <!-- App JS -->
    <script src="assets/js/app.js"></script>

    <!-- Highlight.js -->
    <script src="assets/js/hljs.js"></script>

    <!-- App Settings (safe to remove) -->
    <script src="assets/js/app-settings.js"></script>

</body>

</html>
