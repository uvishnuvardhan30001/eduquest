<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Student - Dashboard</title>

    <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
    <meta name="robots" content="noindex">

    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&display=swap"
        rel="stylesheet">

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

<body class=" layout-fluid">

    <div class="preloader">
        <div class="sk-chase">
            <div class="sk-chase-dot"></div>
            <div class="sk-chase-dot"></div>
            <div class="sk-chase-dot"></div>
            <div class="sk-chase-dot"></div>
            <div class="sk-chase-dot"></div>
            <div class="sk-chase-dot"></div>
        </div>
    </div>

    <!-- Header Layout -->
    <div class="mdk-header-layout js-mdk-header-layout">

        <!-- Header -->
        <div id="header" data-fixed class="mdk-header js-mdk-header mb-0">
            <div class="mdk-header__content">

                <!-- Navbar -->
                <nav id="default-navbar" class="navbar navbar-expand navbar-dark bg-primary m-0">
                    <div class="container-fluid">
                        <!-- Toggle sidebar -->
                        <button class="navbar-toggler d-block" data-toggle="sidebar" type="button">
                            <span class="material-icons">menu</span>
                        </button>

                        <!-- Brand -->
                        <a href="/" class="navbar-brand">
                            <img src="assets/images/logo/white.svg" class="mr-2" alt="EduQuest" />
                            <span class="d-none d-xs-md-block">EduQuest</span>
                        </a>

                        <!-- Search -->
                        <form class="search-form d-none d-md-flex">
                            <input type="text" class="form-control" placeholder="Search">
                            <button class="btn" type="button"><i class="material-icons font-size-24pt">search</i></button>
                        </form>
                        <!-- // END Search -->

                        <!-- User dropdown -->
                        <li class="nav-item dropdown ml-1 ml-md-3">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"><img
                                    src="assets/images/people/50/guy-6.jpg" alt="Avatar" class="rounded-circle"
                                    width="40"></a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <a class="dropdown-item" href="#">
                                    <i class="material-icons">edit</i> Edit Account
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="material-icons">person</i> Public Profile
                                </a>
                                <a class="dropdown-item" href="/">
                                    <i class="material-icons">lock</i> Logout
                                </a>
                            </div>
                        </li>
                        <!-- // END User dropdown -->

                    </div>
                </nav>
                <!-- // END Navbar -->

            </div>
        </div>
        <!-- // END Header -->

        <!-- Header Layout Content -->
        <div class="mdk-header-layout__content">

            <div data-push data-responsive-width="992px" class="mdk-drawer-layout js-mdk-drawer-layout">
                <div class="mdk-drawer-layout__content page ">

                    <div class="container-fluid page__container">
                        <h1 class="h2">Dashboard CC

                        </h1>
                    </div>

                </div>

                <div class="mdk-drawer js-mdk-drawer" id="default-drawer">
                    <div class="mdk-drawer__content ">
                        <div class="sidebar sidebar-left sidebar-dark bg-dark o-hidden" data-perfect-scrollbar>
                            <div class="sidebar-p-y">
                                <div class="sidebar-heading">Main</div>
                                <ul class="sidebar-menu sm-active-button-bg">
                                    <li class="sidebar-menu-item active">
                                        <a class="sidebar-menu-button" href="contentcreatorhome">
                                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">dashboard</i>
                                            Dashboard 
                                        </a>
                                    </li>
                                    <li class="sidebar-menu-item">
    <a class="sidebar-menu-button" data-toggle="collapse" href="#cc-course-menu" aria-expanded="false" aria-controls="cc-course-menu">
        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">view_list</i>
        Courses
        <span class="sidebar-menu-arrow material-icons">expand_more</span>
    </a>
    <ul class="sidebar-submenu collapse" id="cc-course-menu">
        <li class="sidebar-menu-item">
            <a class="sidebar-menu-button" href="cccourse">
                <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">visibility</i>
                View Courses
            </a>
        </li>
        <li class="sidebar-menu-item">
            <a class="sidebar-menu-button" href="cccreatecourse">
                <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">add</i>
                Create Course
            </a>
        </li>
    </ul>
</li>

                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="#">
                                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">book</i>
                                            Students
                                        </a>
                                    </li>
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="#">
                                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">assignment</i>
                                            Assignments
                                        </a>
                                    </li>
                                </ul>

                            </div>
                        </div>
                    </div>
                </div>

            </div>

            <!-- App Settings FAB -->
            <div id="app-settings">
                <app-settings layout-active="default" :layout-location="{
                    'fixed': 'fixed-student-dashboard.html',
                    'default': 'student-dashboard.html'
                }" sidebar-variant="bg-transparent border-0"></app-settings>
            </div>

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

    <!-- Global Settings -->
    <script src="assets/js/settings.js"></script>

    <!-- Moment.js -->
    <script src="assets/vendor/moment.min.js"></script>
    <script src="assets/vendor/moment-range.js"></script>

    <!-- Chart.js -->
    <script src="assets/vendor/Chart.min.js"></script>
    <script src="assets/js/chartjs.js"></script>

    <!-- Student Dashboard Page JS -->
    <script src="assets/js/page.student-dashboard.js"></script>

</body>
</html>
