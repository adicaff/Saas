<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center><h1>Raffles sold</h1></center>
		<g:each in="${raffles}">
			<g:if test="${it.seller.userName == session.user.userName}">
	    		<div class="jumbotron">
				 	<p> Numero: ${it.number} </p>
				 	<p>	Vendedor: ${it.seller.userName} </p>
				 	<p>	Email de contacto: ${it.email} </p>
				 	<p><a class="btn btn-primary btn-lg">Learn more</a></p>
				</div>
			</g:if>	
		</g:each>
	</body>
</html>