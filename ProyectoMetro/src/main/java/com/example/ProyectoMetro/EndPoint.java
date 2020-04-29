package com.example.ProyectoMetro;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.proyectometro.ListaEstacionesRequest;
import org.example.proyectometro.ListaEstacionesResponse;
import org.example.proyectometro.*;
import modelo.*;
import controlador.BoletoDAO;
import controlador.EstacionDAO;


@Endpoint
public class EndPoint {
	@PayloadRoot(localPart = "ComprarBoletoRequest", namespace = "http://www.example.org/ProyectoMetro")
	
	@ResponsePayload
	public ComprarBoletoResponse getReservaBoleto (@RequestPayload ComprarBoletoRequest peticion) {
		ComprarBoletoResponse respuesta = new ComprarBoletoResponse();
		
		
		BoletoDAO boleto = new BoletoDAO(peticion.getIdBoleto(), peticion.getFechaPartida(), peticion.getEstacionOrigen(), 
				peticion.getEstacionDestino(),peticion.getElegirVagon(), peticion.getIngresaMetodoPago());
		
		if (boleto.registrarBoleto()) {
			respuesta.setRespuesta("Reservacion de boleto registrada en el sistema con el id '"+boleto.getIdBoleto()+"'.");
		} else {
			respuesta.setRespuesta("Error, no se pudo registrar la reservacion, el boleto '"+boleto.getIdBoleto()+"' ya se encuentra registado, intenta con otro ID ");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "EditarBoletoRequest", namespace = "http://www.example.org/ProyectoMetro")
	
	@ResponsePayload
	public EditarBoletoResponse getEditarBoleto (@RequestPayload EditarBoletoRequest peticion) {
		EditarBoletoResponse respuesta = new EditarBoletoResponse();
		
		BoletoDAO boleto = new BoletoDAO(peticion.getIdBoleto(),peticion.getFechaPartida() ,peticion.getEstacionOrigen(),peticion.getEstacionDestino(),peticion.getElegirVagon(),peticion.getIngresaMetodoPago());
		
		if (boleto.actualizarBoleto()) {
			respuesta.setRespuesta("Datos de boleto numero '"+boleto.getIdBoleto()+"' actualizados correctamente");
		} else {
			respuesta.setRespuesta("Eror, datos no actualizados ");
		}

		return respuesta;
	}

	@PayloadRoot(localPart = "CancelarBoletoRequest", namespace = "http://www.example.org/ProyectoMetro")
	
	@ResponsePayload
	public CancelarBoletoResponse getCancelarBoleto (@RequestPayload CancelarBoletoRequest peticion) {
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();
		
		BoletoDAO boleto = new BoletoDAO(peticion.getIdBoleto());
		
		if (boleto.eliminarBoleto()) {
			respuesta.setRespuesta("Boleto cancelado");
		} else {
			respuesta.setRespuesta("No se ha podido cancelar este boleto");
		}
		
		return respuesta;
	}

	@PayloadRoot(localPart = "ConsultarBoletoRequest", namespace = "http://www.example.org/ProyectoMetro")
	
	@ResponsePayload
	public ConsultarBoletoResponse getBuscarBoleto (@RequestPayload ConsultarBoletoRequest peticion) {
		ConsultarBoletoResponse respuesta = new ConsultarBoletoResponse();
		
		BoletoDAO boleto = new BoletoDAO(peticion.getIdBoleto());
		
		Boleto b = boleto.consultarBoleto(peticion.getIdBoleto());
		
		if (b != null) {

			
			respuesta.setIdBoleto(boleto.getIdBoleto());
			respuesta.setEstacionOrigen(b.getEstacionOrigen());
			respuesta.setEstacionDestino(b.getEstacionDestino());
			respuesta.setElegirVagon(b.getElegirVagon());
			respuesta.setIngresaMetodoPago(b.getIngresaMetodoPago());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ListaEstacionesRequest", namespace = "http://www.example.org/ProyectoMetro")
	
	@ResponsePayload
	public ListaEstacionesResponse getListaEstaciones (@RequestPayload ListaEstacionesRequest peticion) {
		ListaEstacionesResponse respuesta = new ListaEstacionesResponse();
		
		EstacionDAO estacion = new EstacionDAO(peticion.getLinea());
		
		Estacion e = estacion.consultarEstacion(peticion.getLinea());
		
		if (e != null) {

			respuesta.setZona(e.getZona());
			respuesta.setPrecio(e.getPrecio());
			respuesta.setNombre(e.getNombre());
			respuesta.setLinea(e.getLinea());
		}
		
		return respuesta;
	}
	


}
