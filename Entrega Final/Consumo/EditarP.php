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
					<li><a href="EstacionesH.html">Estaciones</a></li>
					<li><a href="ComprarBoletoH.html">Comprar Boleto</a></li>
					<li><a href="ConsultarH.html">Consular Boleto</a></li>
					<li  class="active"><a href="EditarH.html">Editar Boleto</a></li>
					<li><a href="CancelarH.html">Cancelar Boleto</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container">
		<div class="content">
			<h2>Boleto &raquo; Editar datos del boleto</h2>
			<hr><hr />
<?php
	
	$idBoleto = isset($_GET['id']);
	$fechaPartida = isset($_GET['fecha']); 
	$estacionOrigen = isset($_GET['origen']);
	$estacionDestino = isset($_GET['destino']);
	$elegirVagon = isset($_GET['vagon']);
	$ingresaMetodoPago = isset($_GET['pago']);

	$client=new SoapClient("http://3.91.49.75:8080/ProyectoMetro.wsdl");

 
    //pasando los parámetros a un array
    $param = array("idBoleto"=>$_GET['id'], "fechaPartida" => $_GET['fecha'], "estacionOrigen" => $_GET['origen'], "estacionDestino" => $_GET['destino'], "elegirVagon" => $_GET['vagon'], "ingresaMetodoPago" => $_GET['pago']);

 
    //llamando al método y pasándole el array con los parámetros
    $response = $client->__soapCall('EditarBoleto',array($param));
	print"<h1>".$response->{'respuesta'}."</h1>";
?>

		</div>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	</body>
</html>