<!DOCTYPE html>
<html>
	<body>
		<g:findAll in="${users}" expr="true">
    		<p>${it.userName}, ${it.lastName}, ${it.firstName}</p>
		</g:findAll>
	</body>
</html>