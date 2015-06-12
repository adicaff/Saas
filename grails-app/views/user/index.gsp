<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="navbar">
		<meta name="layout" content="main">
	</head>
	<body>
		<g:each in="${users}">
 
	    		<div class="jumbotron">
				 	<p> UserName: ${it.userName} </p>
				 	<p>	First Name: ${it.firstName} </p>
				 	<p>	Last Name : ${it.lastName} </p>
				 	<p>	email: ${it.email} </p>
				 	<p>	phone : ${it.phone} </p>
				 	<p><g:link class="btn btn-default btn-sm" controller="user" action="delete" id="${it.id}">Remove</g:link></p>
				</div>
 
		</g:each>
	</body>
</html>