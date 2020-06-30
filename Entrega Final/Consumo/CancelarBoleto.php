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
    $param = array("idBoleto"=>"112");

 
    //llamando al método y pasándole el array con los parámetros
    $response = $client->__soapCall('CancelarBoleto',array($param));
	print"<h1>".$response->{'respuesta'}."</h1>";
?>

</body>
</html>