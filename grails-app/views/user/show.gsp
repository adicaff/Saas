<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		
		<g:if test="${session.user.getClass() == rifa.Seller}">
			<center><h1>Seller Options</h1></center>
			<p><g:link class="btn btn-success" controller="raffle" action="sale">Raffle Sale</g:link></p>
			<br>
			<p><g:link class="btn btn-success" controller="raffle" action="index">My Raffles Sold</g:link></p>
		</g:if>
		<g:if test="${session.user.getClass() == rifa.Administrator}">
			<center><h1>Administrator Options</h1></center>
			<p><g:link class="btn btn-success" controller="user" action="index">Manage Users</g:link></p>
			<br>
			<p><g:link class="btn btn-success" controller="draw" action="show">Launch Draw</g:link></p>
		</g:if>
	</body>
</html>