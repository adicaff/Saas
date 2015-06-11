<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
	  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	  <meta name="layout" content="navbar">
	  <title><g:layoutTitle default="RifaApp"/></title>
	  <asset:stylesheet src="application.css"/>
	  <asset:javascript src="application.js"/>
	        <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
	  <g:layoutHead/>
 </head>
	<body>
		<g:render template="/header/mainHeader"></g:render>
		<div class="container">
       		<g:layoutBody/>
    	</div>
	</body>
</html>