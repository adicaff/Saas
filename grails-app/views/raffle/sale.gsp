<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<center>
			<form class="form-horizontal" action="create" method="POST">
			  <fieldset>
			    <div class="form-group">
			      <label for="number" class="col-lg-5 control-label">Raffle Number</label>
			      <div class="col-lg-4">
			        <input class="form-control" name="number" placeholder="number" type="text">
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="purchase" class="col-lg-5 control-label">Purchase Date</label>
			      <div class="col-lg-4">
			        <g:datePicker name="purchaseDate" value="${new Date()}"
              precision="day" years="${2014..2060}"/>
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="expiration" class="col-lg-5 control-label">Expiration Date</label>
			      <div class="col-lg-4">
			        <g:datePicker name="expirationDate" value="${new Date()}"
              precision="month" years="${2014..2100}"/>
			      </div>
			    </div>
			    <div class="form-group">
			      <label for="email" class="col-lg-5 control-label">Buyer's email</label>
			      <div class="col-lg-4">
			        <input class="form-control" name="email" placeholder="email" type="text">
			      </div>
			    </div>
			    
			    <div class="form-group">
			      <div class="col-lg-12">
			        <button type="submit" class="btn btn-success btn-lg">Sale</button>
			        <button type="reset"  class="btn btn-default btn-sm" >Reset</button>
			      </div>
			    </div>
			  </fieldset>
			</form>
		</center>
	</body>
</html>