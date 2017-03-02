<header class="header">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${pageContext.request.contextPath}/">WebSiteName</a>
			</div>
		

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="${pageContext.request.contextPath}/home"> <spring:message code="nav.link.home" /></a></li>					
					<li><a href="${pageContext.request.contextPath}/products"> <spring:message code="nav.link.products" />	</a></li>
					<li><a href="${pageContext.request.contextPath}/contact"> <spring:message code="nav.link.contact" />	</a></li>
				    <li><a href="${pageContext.request.contextPath}/about"> <spring:message code="nav.link.about" />	</a></li>
				
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Help <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Page 1-1</a></li>
							<li><a href="#">Page 1-2</a></li>
							<li><a href="#">Page 1-3</a></li>
						</ul></li>
						
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Sign Up</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>

</header>