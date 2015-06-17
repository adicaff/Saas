<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center>
			<form class="form-horizontal" url="[action:'login',controller:'auth']" method="POST">
			  <fieldset>
			    <div class="form-group">
			      <label for="userName" class="col-lg-4 control-label">Username</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="userName" placeholder="userName" type="text">
			        <g:hasErrors bean="${user}" field="username">
	                    <g:eachError bean="${user}" field="username">
	                        <p style="color: red;"><g:message error="${it}"/></p>
	                    </g:eachError>
                	</g:hasErrors>
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="password" class="col-lg-4 control-label">Password</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="password" placeholder="Password" type="password">
			      </div>
			    </div>
			    <div class="form-group">
			      <div class="col-lg-12">
			        <button type="submit" class="btn btn-success btn-lg">Login</button>
			        <g:link class="btn btn-default btn-sm" controller="user" action="signup">Signup</g:link>
			      </div>
			    </div>
		   	</fieldset>
			</form>
		</center>
	</body>
</html>