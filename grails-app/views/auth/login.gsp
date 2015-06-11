<!DOCTYPE html>
<html>
	<body>
		<h1>LOGIN</h1>
		<form action="login" method="POST">
		  	User name: <input type="text" name="userName"><br>
		  	Password: <input type="password" name="password"><br>
		  	<input type="submit" value="Login">
		</form> 
		<g:link controller="user" action="signup">SignUp</g:link>
	</body>
</html>