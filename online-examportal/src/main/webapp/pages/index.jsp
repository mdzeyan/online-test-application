<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" href="/css/style.css"></link>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<title>Insert title here</title>
</head>
<body>

 <!-- coding area -->

    <!-- starting navbar -->
    
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">

        <a class="navbar-brand" href="/">OnlineQuiz</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Service</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login">Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="registration">Sign Up</a>
            </li>
          </ul>
        </div>

        </div>
        
      </nav>
      <!-- end navbar -->

      <!-- start of header -->

      <div class="header">

        <div class="container h-100">

            <div class="row h-100 align-items-center">
                <div class="col-md-12 text-center">
                    <h2>Welcome to Online Quiz Portal</h2>
                </div>
            </div>

        </div>

      </div>

      <!-- end of header -->

      <!-- start of message section -->

      <section class="message py-5">
        <div class="container text-center">

            <h1>We have got What You Need</h1>
            <p>
                Some companies use aptitude tests to help them make hiring decisions.
                These tests, called career assessment tests, 
                help human resources (HR) personnel learn more about a prospective employee's 
                strengths and weaknesses. Career assessment tests may also be used 
                within a company to make promotion decisions.
            </p>

        </div>
      </section>

      <!-- end of message section -->

      <!-- start of services section -->

      <section class="services py-5">
        <div class="container text-center ">
            <h1>About our Services</h1>
            <div class="row py-5">
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <i class="fa fa-area-chart" style="font-size:48px;"></i>
                        <div class="card-body">
                          <h5 class="card-title">Aptitude Quiz</h5>
                          <p class="card-text">An aptitude test is an exam used to determine an individual's skill or propensity to succeed in a given activity.</p>
                          <a href="login" class="btn btn-primary">Go and Solve</a>
                        </div>
                      </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <i class="fa fa-bar-chart" style="font-size:48px;"></i>
                        <div class="card-body">
                          <h5 class="card-title">Coding Quiz</h5>
                          <p class="card-text">Coding test are assessments that are designed to evaluate a developer's coding skills and aptitude.</p>
                          <a href="login" class="btn btn-primary">Go and Solve</a>
                        </div>
                      </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <i class="fa fa-line-chart" style="font-size:48px;"></i>
                        <div class="card-body">
                          <h5 class="card-title">Verbal Quiz</h5>
                          <p class="card-text">any test or scale in which performance depends upon one's ability to comprehend, use, or otherwise manipulate words.</p>
                          <a href="login" class="btn btn-primary">Go and Solve</a>
                        </div>
                      </div>
                </div>
            </div>
        </div>
      </section>

      <!-- end of services section -->

      <!-- start of footer section -->

      <section class="footer bg-dark">
        <div class="container py-5 text-white">
            <p>Copyright @ 2023 - Amir Zeyan</p>
        </div>
      </section>

      <!-- end of footer section -->




    <!-- coding area -->

    




    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="action.js"></script> 

</body>
</html>