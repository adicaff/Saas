<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center><h1>Raffles Options</h1></center>
		<g:if test="${session.user.getClass() == rifa.Seller}">
			<p><g:link class="btn btn-success" controller="raffle" action="sale">Raffle Sale</g:link></p>
			<br>
			<p><g:link class="btn btn-success" controller="raffle" action="index">My Raffles Sold</g:link></p>
		</g:if>
		<g:if test="${session.user.getClass() == rifa.Administrator}">
			<p><g:link class="btn btn-success" controller="raffle" action="sale">Launch Draw</g:link></p>
			<br>
			<p><g:link class="btn btn-success" controller="user" action="index">Manage Users</g:link></p>
		</g:if>
	</body>
</html>