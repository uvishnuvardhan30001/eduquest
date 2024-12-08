<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Signup</title>

    <!-- Prevent the demo from appearing in search engines -->
    <meta name="robots" content="noindex">

    <!-- Fonts and Icons -->
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500&display=swap" rel="stylesheet">
    <link type="text/css" href="assets/css/material-icons.css" rel="stylesheet">
    <link type="text/css" href="assets/css/fontawesome.css" rel="stylesheet">

    <!-- App CSS -->
    <link type="text/css" href="assets/css/app.css" rel="stylesheet">
</head>

<body class="login">
    <div class="d-flex align-items-center" style="min-height: 100vh;">
        <div class="col-sm-8 col-md-6 col-lg-4 mx-auto" style="min-width: 300px;">
            <div class="d-flex justify-content-center mb-5 navbar-light">
                <a href="content-creator-dashboard.html" class="navbar-brand m-0">EduQuest</a>
            </div>
            <div class="card navbar-shadow">
                <div class="card-header text-center">
                    <h4 class="card-title">Sign Up</h4>
                    <p class="card-subtitle">Create a new account</p>
                </div>

                <form action="insertcontentcreator" novalidate method="post">
                    <div class="form-group">
                        <label class="form-label" for="ccname">Name:</label>
                        <div class="input-group input-group-merge">
                            <input id="ccname" name="ccname" type="text" required class="form-control" placeholder="Your first and last name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccemail">Email Address:</label>
                        <div class="input-group input-group-merge">
                            <input id="ccemail" name="ccemail" type="email" required class="form-control" placeholder="Your email address">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccpwd">Password:</label>
                        <div class="input-group input-group-merge">
                            <input id="ccpwd" name="ccpwd" type="password" required class="form-control" placeholder="Choose a password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccgender">Gender:</label>
                        <div class="input-group">
                            <input type="radio" id="ccmale" name="ccgender" value="Male" required>
                            <label for="ccmale">Male</label>
                            <input type="radio" id="ccfemale" name="ccgender" value="Female" required>
                            <label for="ccfemale">Female</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccdob">Date of Birth:</label>
                        <div class="input-group">
                            <input id="ccdob" name="ccdob" type="date" required class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="cccontact">Contact Number:</label>
                        <div class="input-group">
                            <input id="cccontact" name="cccontact" type="text" required class="form-control" placeholder="Enter your contact number">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccdept">Department:</label>
                        <select id="ccdept" name="ccdept" class="form-control" required>
                            <option value="">Select Department</option>
                            <option value="Computer Science">Computer Science</option>
                            <option value="Electrical Engineering">Electrical Engineering</option>
                            <option value="Mechanical Engineering">Mechanical Engineering</option>
                            <option value="Civil Engineering">Civil Engineering</option>
                            <option value="Electronics and Communication">Electronics and Communication</option>
                            <option value="Information Technology">Information Technology</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="form-label" for="ccgraduation">Graduation:</label>
                        <select id="ccgraduation" name="ccgraduation" class="form-control" required>
                            <option value="BTech">BTech</option>
                            <option value="MTech">MTech</option>
                            <option value="PhD">PhD</option>
                        </select>
                    </div>
                    <div class="form-group text-center mb-3">
                        <input id="terms" type="checkbox" required class="custom-control-input">
                        <label for="terms" class="custom-control-label text-black-70">I agree to the <a href="#" class="text-black-70">Terms of Use</a></label>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
                </form>
            </div>
            <div class="card-footer text-center text-black-50">Already signed up? <a href="content-creator-login">Login</a></div>
        </div>
    </div>
</body>

</html>
