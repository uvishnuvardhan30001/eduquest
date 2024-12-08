<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LMS Navigation Bar</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>

<!-- Top Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="#">
        <img src="images/logo.png" alt="EduQuest Logo" class="navbar-logo">
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="studenthome">DashBoard</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Profile</a>
            </li>
            <li class="nav-item">
                <a class="nav-link btn btn-danger text-white ml-2" href="/" style="border-radius: 5px;">
                    Logout
                </a>
            </li>
        </ul>
    </div>
</nav>


<!-- Side Navbar and Main Content -->
<div class="d-flex" style="margin-top: 10px;"> <!-- Added margin-top to push content below fixed navbar -->
    <!-- Side Navbar -->
    <div class="side-navbar bg-dark p-3">
        <ul class="nav flex-column"><br/><br/><br/>
            <li class="nav-item">
                <a class="nav-link text-white" href="studenthome">DashBoard</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">All Courses</a>
            </li>
             <li class="nav-item">
                <a class="nav-link" href="#">My courses</a>
            </li>
             <li class="nav-item">
                <a class="nav-link" href="#">Assignments</a>
            </li>
        </ul>
    </div>
</div>

<!-- Optional JavaScript -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
