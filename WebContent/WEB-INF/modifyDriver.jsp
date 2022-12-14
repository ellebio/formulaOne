<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>

<head>
<title>Modify driver - Formula 1 by Leonardo Bianchi</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<link rel="icon" href="images/logo.svg">
</head>

<body class="is-preload">
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="MainServlet?action=index" class="logo"> <span
					class="symbol"><img src="images/logo.svg" alt="" /></span><span
					class="title">Formula 1</span>
				</a>

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="MainServlet?action=index">Home</a></li>
				<li><a href="MainServlet?action=drivers">Drivers</a></li>
				<li><a href="MainServlet?action=teams">Teams</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1>Modify driver</h1>

				<section>
					<h2>Modify driver information</h2>
					<span class="image left"> <img
						src=${driverSpecific.getImage() } alt='' />
					</span>
					<form method="get" action="MainServlet">
						<input type="hidden" value="executeModifyDriver" name="action">
						<input type="hidden" value="${driverSpecific.getId()}" name="id">
						<div class="row gtr-uniform">
							<div class="col-6 col-12-xsmall">
								<input type="text" name="name" id="name" value=""
									placeholder="Name: ${driverSpecific.getName() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="surname" id="surname" value=""
									placeholder="Surname: ${driverSpecific.getSurname() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="carNumber" id="carNumber" value=""
									placeholder="Car number: ${driverSpecific.getCarNumber() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="team" id="team" value=""
									placeholder="Team id: ${driverSpecific.getTeam() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="dateOfBirth" id="dateOfBirth" value=""
									placeholder="Date of birth: ${driverSpecific.getDateOfBirth() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="country" id="country" value=""
									placeholder="Country: ${driverSpecific.getCountry() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="podiums" id="podiums" value=""
									placeholder="Podiums: ${driverSpecific.getPodiums() }">
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="text" name="worldChampionships"
									id="worldChampionships" value=""
									placeholder="Drivers championships: ${driverSpecific.getWorldChampionships() }">
							</div>
							<div class="col-12">
								<ul class="actions">
									<li><input type="submit" value="Modify" class="primary">
									<li><input type="reset" value="Reset">
								</ul>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>

		<!-- Footer -->
		<footer id="footer">
			<div class="inner">
				<section>
					<h2>Get in touch</h2>
					<form method="post" action="#">
						<div class="fields">
							<div class="field half">
								<input type="text" name="name" id="name" placeholder="Name" />
							</div>
							<div class="field half">
								<input type="email" name="email" id="email" placeholder="Email" />
							</div>
							<div class="field">
								<textarea name="message" id="message" placeholder="Message"></textarea>
							</div>
						</div>
						<ul class="actions">
							<li><input type="submit" value="Send it" class="primary" /></li>
						</ul>
					</form>
				</section>
				<section>
					<h2>Follow</h2>
					<ul class="icons">
						<li><a href="#" class="icon brands style2 fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands style2 fa-facebook-f"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon brands style2 fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon brands style2 fa-dribbble"><span
								class="label">Dribbble</span></a></li>
						<li><a href="#" class="icon brands style2 fa-github"><span
								class="label">GitHub</span></a></li>
						<li><a href="#" class="icon brands style2 fa-500px"><span
								class="label">500px</span></a></li>
						<li><a href="#" class="icon solid style2 fa-phone"><span
								class="label">Phone</span></a></li>
						<li><a href="#" class="icon solid style2 fa-envelope"><span
								class="label">Email</span></a></li>
					</ul>
				</section>
				<ul class="copyright">
					<li>&copy; Formula 1 by Leonardo Bianchi. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
					<li>Pages viewed: ${numeroPagine }</li>
				</ul>
			</div>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>

</html>