<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="accountSetupApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liberty Mutual</title>
<!-- <link rel="stylesheet"
	href="resources/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/bootstrap/custom/css/custom.css"> -->
<!-- <script src="resources/bootstrap/3.3.6/js/jquery.min.js"></script>
<script src="resources/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->


<script src="resources/angular/1.5.8/angular.js"></script>
<script src="resources/angular/1.5.8/angular-route.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<script type="text/javascript" src="resources/js/accountsetupapp.js"></script>
<script type="text/javascript"
	src="resources/js/accountsetupconstants.js"></script>
<script type="text/javascript"
	src="resources/js/accountsetupcontrollers.js"></script>
<script type="text/javascript"
	src="resources/js/accountsetupservices.js"></script>
<style type="text/css">
h1 {
	margin: 30px 0;
	padding: 0 200px 15px 0;
	border-bottom: 1px solid #E5E5E5;
}

.form-header {
	margin: 90px;
}

.img-responsive2 {
	display: inline-block;
	max-width: 40%;
	height: 40%;
}

. /* navbar-brand {
	margin-top: 15px;
	max-width: 20%;
	padding: 0;
}

.navbar {
  margin: 10px 0;
}

.brand-name {
 font-family: 'Josefin Slab', serif;
 font-size: 47px;
 font-weight: bold;
 color: #444;
 text-decoration: none;
}
 */
.navbar .nav>li>a {
	line-height: 200px;
}

s
input.ng-invalid.ng-dirty {
	border: 1px solid red;
}
</style>
</head>

<body>
	<div class="form-header">
		<div ng-controller="billAccController">
			<div class="row">
				<nav id="myNavbar"
					class="navbar navbar-default navbar-inverse navbar-fixed-top"
					role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">Claim Center</a>
					</div>
					<ul class="nav navbar-nav">
						<li><a class="navbar-brand" href="#/policyDetails">Policy
								Information</a></li>
						<!-- <li><a href="#">Claim Submission</a></li> -->
					</ul>

					<ul class="nav navbar-nav">
						<li><a href="#/signup" class="navbar-brand">
								Customer Registration</a></li>
					</ul>
				</div>
				</nav>
<!-- 				<div class="container">
					<div class="jumbotron">
						<div class="row">
							<h3 align="center">Liberty Mutual Insurance</h3>
							<div class="panel panel-default">
								<div class="panel-body" align="justify"></div>
								<img src="images/LM.jpg" class="img-circle" alt="Cinque Terre" width="500" height="300"  >
							</div>
						</div>
					</div>
				</div> -->
				<div>
					<div class="row">
						<div ng-view></div>
					</div>

				</div>

			</div>
			<!-- <div class = "row">
		<div class="float-lg-right">
		<img src="images/LM.jpg" class="img-rounded" alt="Cinque Terre" width="900" height="500" align="middle">
		<img src="images/LM.jpg" class="img-circle" alt="Cinque Terre" width="900" height="500" >
		</div>
		</div>
 -->

			<div class="row">
				<div class="col-xs-12">
					<footer class="container-fluid text-center">
					<p>&copy; Copyright Cognizant Solutions US corp.,</p>
					</footer>
				</div>
			</div>
</body>
</html>
