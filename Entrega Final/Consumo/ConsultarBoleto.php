<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Metro</title>
</head>
<body>
	
<?php

    //instanciando un nuevo objeto cliente para consumir el webservice
    $client=new SoapClient("http://3.91.49.75:8080/ProyectoMetro.wsdl");
 
    //pasando los parámetros a un array
    $param = array("idBoleto"=>"10");

 
    //llamando al método y pasándole el array con los parámetros
    $response = $client->__soapCall('ConsultarBoleto',array($param));
    
	print"<h1>".$response->{'idBoleto'}."</h1>";
	
	print"<h1>".$response->{'estacionOrigen'}."</h1>";
	
	print"<h1>".$response->{'estacionDestino'}."</h1>";
	
	print"<h1>".$response->{'elegirVagon'}."</h1>";
	
	print"<h1>".$response->{'ingresaMetodoPago'}."</h1>";
?>

</body>
</html>