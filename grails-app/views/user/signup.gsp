<!DOCTYPE html>
<html>
	<body>
		<h1>SIGNUP</h1>
		<form action="save" method="POST">
		  	User name: <input type="text" name="userName"><br>
		  	Password: <input type="password" name="password"><br>
		  	Confirm Password: <input type="password" name="confirmPassword"><br>
		  	First name: <input type="text" name="firstName"><br>
		  	Last name: <input type="text" name="lastName"><br>
		  	Email: <input type="text" name="email"><br>
		  	Phone: <input type="text" name="phone"><br>
		  	<SELECT NAME="selRole" SIZE=1> 
			<OPTION VALUE="Admin">Admin</OPTION>
			<OPTION VALUE="Seller">Seller</OPTION>
			<OPTION VALUE="Buyer">Buyer</OPTION>
			</SELECT> 
		  	<input type="submit" value="Create account">
		</form>
	</body>
</html>