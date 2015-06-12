<!DOCTYPE html>
<html>
	<body>
		<g:findAll in="${raffles}" expr="true">
    		<p>${it.number},${it.seller}, ${it.email}, ${it.purchaseDate}</p>
		</g:findAll>
	</body>
</html>