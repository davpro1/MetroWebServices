package com.example.MetroV2;

import org.example.metrov2.ReservaBoletoRequest;
import org.example.metrov2.ReservaBoletoResponse;
import org.example.metrov2.EditarBoletoRequest;
import org.example.metrov2.EditarBoletoResponse;
import org.example.metrov2.CancelarBoletoRequest;
import org.example.metrov2.CancelarBoletoResponse;
import org.example.metrov2.BuscarBoletoRequest;
import org.example.metrov2.BuscarBoletoResponse;
import org.example.metrov2.RegistrarClienteRequest;
import org.example.metrov2.RegistrarClienteResponse;
import org.example.metrov2.EditarClienteRequest;
import org.example.metrov2.EditarClienteResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class EndPoint{
	
	@PayloadRoot(localPart = "ReservaBoletoRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public ReservaBoletoResponse getBoleto (@RequestPayload ReservaBoletoRequest peticion ) {
		ReservaBoletoResponse respuesta = new ReservaBoletoResponse();
		respuesta.setRespuesta("Boleto reservado correctamente");
		return respuesta;
	}

	@PayloadRoot(localPart = "EditarBoletoRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public EditarBoletoResponse getBoleto (@RequestPayload EditarBoletoRequest peticion ) {
		EditarBoletoResponse respuesta = new EditarBoletoResponse();
		respuesta.setRespuesta("Datos Actualizados correctamente");
		return respuesta;
	}

	@PayloadRoot(localPart = "CancelarBoletoRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public CancelarBoletoResponse getBoleto (@RequestPayload CancelarBoletoRequest peticion ) {
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();
		respuesta.setRespuesta("El boleto ha sido cancelado");
		return respuesta;
	}

	@PayloadRoot(localPart = "BuscarBoletoRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public BuscarBoletoResponse getBoleto (@RequestPayload BuscarBoletoRequest peticion ) {
		BuscarBoletoResponse respuesta = new BuscarBoletoResponse();
		respuesta.setRespuesta("El boleto sera mostrado cuando se implemente la base de datos");
		return respuesta;
	}

	@PayloadRoot(localPart = "RegistrarClienteRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public RegistrarClienteResponse getCliente (@RequestPayload RegistrarClienteRequest peticion ) {
		RegistrarClienteResponse respuesta = new RegistrarClienteResponse();
		respuesta.setRespuesta("Registro Exitoso");
		return respuesta;
	}

	@PayloadRoot(localPart = "EditarClienteRequest", namespace = "http://www.example.org/MetroV2")
	
	@ResponsePayload
	public EditarClienteResponse getBoleto (@RequestPayload EditarClienteRequest peticion ) {
		EditarClienteResponse respuesta = new EditarClienteResponse();
		respuesta.setRespuesta("Datos del cliente actualizados correctamente");
		return respuesta;
	}
}