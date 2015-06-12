<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center><h1>Raffles sold</h1></center>
		<g:each in="${raffles.reverse()}">
			<g:if test="${it.seller.userName == session.user.userName}">
	    		<div class="jumbotron">
				 	<p> Number: ${it.number} </p>
				 	<p>	Seller: ${it.seller.userName} </p>
				 	<p>	Contact Email: ${it.email} </p>
				 	<p><g:link class="btn btn-success btn-sm" controller="raffle" action="show" id="${it.id}">Details</g:link></p>
				</div>
			</g:if>
		</g:each>
	</body>
</html>