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
    $param = array("linea"=>"1");

 
    //llamando al método y pasándole el array con los parámetros
    $response = $client->__soapCall('ListaEstaciones',array($param));
    
	print"<h1>".$response->{'zona'}."</h1>";
	
	print"<h1>".$response->{'precio'}."</h1>";
	
	print"<h1>".$response->{'nombre'}."</h1>";
	
	print"<h1>".$response->{'linea'}."</h1>";
	
?>

</body>
</html>