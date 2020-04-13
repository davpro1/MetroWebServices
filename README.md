# MetroWebServices
ServicioWeb Metro
El siguiente proyecto, es realizado para la Experiencia Educativa "Tecnologias para la integracion de soluciones" 
Se llevara un registro del avance en el desarrollo de proyecto

## Servidor para acceder
[Link del Servidor](http://54.162.225.248:8080/hotel.wsdl) 

## Funcionalidades del servicio
- [ ] Reservar un boleto
- [ ] Editar reserva de Boleto
- [ ] Cancelar reserva de Boleto
- [ ] Buscar boleto
- [ ] Registrar Cliente
- [ ] Editar Cliente

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


### Registrar cliente

| Atributo             | Tipo   |
| -------------------- | ------ |
| idCliente            | Int    |
| nombre               | String |
| apellido             | String |
| telefono             | String |
| correo               | String |

### Editar cliente

| Atributo             | Tipo   |
| -------------------- | ------ |
| nombre               | String |
| apellido             | String |
| telefono             | String |
| correo               | String |



## Mensajes
- Reservar boleto

Al momento, solo devuelve un mensaje donde indica que el boleto se reservó correctamente, en proxima version se planea que imprima el mismo mensaje sumandole el ID del boleto, este se va a generar automaticamente

- Editar reserva de boleto

Para editar el boleto, se solicita el ID del boleto, y se ingresan los datos nuevamente (a excepcion del ID), regresa un mensaje donde indica que la reserva ha sido modificada correctamente

- Cancelar reserva de boleto

Se ingresa el ID del boleto, Envia un mensaje "El boleto ha sido cancelado"

- Registrar Cliente

Este metodo solicita el ID del Boleto que se quiere buscar, el mensaje que regresa son los datos de la Reserva que se hizo.

- Registrar cliente

Se ingresan los datos del cliente y regresa un mensaje donde indica que el registro fue exitoso, en siguiente version se pretende que regrese el mismo mensaje agregandole un ID al cliente

- Editar cliente

Se ingresa el ID del cliente, despues se modifican los datos solicitados al registrar al cliente, regresa un mensaje indicando que los datos del cliente fueron actualizados correctamente

