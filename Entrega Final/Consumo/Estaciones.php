<!DOCTYPE html>
<html lang="es">
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Metro</title>

	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap-datepicker.css" rel="stylesheet">
	<link href="css/style_nav.css" rel="stylesheet">
	<style>
		.content {
			margin-top: 80px;
		}
	</style>

</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand visible-xs-block visible-sm-block" href="">Inicio</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav ">
					<li  class="active"><a href="EstacionesH.html">Estaciones</a></li>
					<li><a href="ComprarBoletoH.html">Comprar Boleto</a></li>
					<li><a href="ConsultarH.html">Consular Boleto</a></li>
					<li><a href="EditarH.html">Editar Boleto</a></li>
					<li><a href="CancelarH.html">Cancelar Boleto</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container">
		<div class="content">
			<h2>Estaciones &raquo; Estaciones</h2>
			<hr><hr />
<?php

	$linea = isset($_GET['linea']);

	$client=new SoapClient("http://3.91.49.75:8080/ProyectoMetro.wsdl");

	$param = array("linea"=>$_GET['linea']);
				
	$response = $client->__soapCall('ListaEstaciones',array($param));

	
	print("<h2>Pais</h2>");
	print"<h3>".$response->{'zona'}."</h3>";
	print("<h2>Precio del boleto</h2>");
	print"<h3>".$response->{'precio'}."</h3>";
	print("<h2>Nombre de la estacion</h2>");
	print"<h3>".$response->{'nombre'}."</h3>";
	print("<h2>Numero de linea</h2>");
	print"<h3>".$response->{'linea'}."</h3>";

?>
		</div>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	</body>
</html>
