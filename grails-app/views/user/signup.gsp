<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center>
			<form class="form-horizontal" action="save" method="POST">
			  <fieldset>
			    <div class="form-group">
			      <label for="userName" class="col-lg-4 control-label">Username</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="userName" placeholder="userName" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="password" class="col-lg-4 control-label">Password</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="password" placeholder="Password" type="password">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="confirmPassword" class="col-lg-4 control-label">Confirm Password</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="confirmPassword" placeholder="Confirm Password" type="password">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="firstName" class="col-lg-4 control-label">First Name</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="firstName" placeholder="firstName" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="lastName" class="col-lg-4 control-label">Last Name</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="lastName" placeholder="lastName" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="email" class="col-lg-4 control-label">Email</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="email" placeholder="Email" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="phone" class="col-lg-4 control-label">Phone</label>
			      <div class="col-lg-5">
			        <input class="form-control" name="phone" placeholder="Phone" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="select" class="col-lg-4 control-label">User Rol</label>
			      <div class="col-lg-5">
			        <select class="form-control" name="selRole">
			          <option>Seller</option>
			          <option>Administrator</option>

			        </select>
			      </div>
			    </div>
			    <div class="form-group">
			      <div class="col-lg-12">
			        <button type="submit" class="btn btn-success btn-lg">SignIn</button>
			        <button type="reset"  class="btn btn-default btn-sm" >Reset</button>
			      </div>
			    </div>
			  </fieldset>
			</form>
		</center>
	</body>
</html>