# MetroWebServices
ServicioWeb Metro
El siguiente proyecto, es realizado para la Experiencia Educativa "Tecnologias para la integracion de soluciones" 
Se llevara un registro del avance en el desarrollo de proyecto

La tercera version ya se encuentra en Pull requests
Aún no es subida al servidor

El proyecto terminado ya se encuentra en el repositorio como "ProyectoMetro"
Se realizaron modificaciones en las clases utilizadas y en las funcionalidades del servicio

## Servidor para acceder
[Link del Servidor](http://3.91.49.75:8080/ProyectoMetro.wsdl) 

## Funcionalidades del servicio
- [x] Reservar un boleto
- [x] Editar reserva de Boleto
- [x] Cancelar reserva de Boleto
- [x] Buscar boleto


## Diagrama de clases

### Reserva Boleto

| Atributo             | Tipo   |
| -------------------- | ------ |
| idBoleto             | Int    |
| FechaPartida         | Date   |
| EstacionOrigen       | String |
| EstacionDestino      | String |
| ElegirVagon          | String |
| IngresaMetodoPago    | String |


### Editar reserva de Boleto

| Atributo               | Tipo   |  
| ---------------------- | ------ |
| NuevafechaPartida      | Date   |
| NuevaestacionOrigen    | String |
| NuevaestacionDestino   | String |
| NuevoVagon             | String |
| NuevoMetodoPago        | String |



## Mensajes
- Reservar boleto

Al momento, solo devuelve un mensaje donde indica que el boleto se reservó correctamente, en proxima version se planea que imprima el mismo mensaje sumandole el ID del boleto, este se va a generar automaticamente

- Editar reserva de boleto

Para editar el boleto, se solicita el ID del boleto, y se ingresan los datos nuevamente (a excepcion del ID), regresa un mensaje donde indica que la reserva ha sido modificada correctamente

- Cancelar reserva de boleto

Se ingresa el ID del boleto, Envia un mensaje "El boleto ha sido cancelado"

- Buscar Boleto

Este metodo solicita el ID del Boleto que se quiere buscar, el mensaje que regresa son los datos de la Reserva que se hizo.
