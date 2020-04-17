package modelo;

import java.sql.Date;

public class BoletoM {
	private int idBoleto;
	private Date fechaPartida;
	private String estacionOrigen;
	private String estacionDestino;
	private String elegirVagon;
	private String ingresaMetodoPago;
	

	
	public BoletoM(int idBoleto, String fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon,String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = Date.valueOf(fechaPartida);
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	
	public BoletoM(Date fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon,String ingresaMetodoPago) {
		this.fechaPartida = fechaPartida;
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	public BoletoM(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	
	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public Date getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public String getEstacionOrigen() {
		return estacionOrigen;
	}

	public void setEstacionOrigen(String estacionOrigen) {
		this.estacionOrigen = estacionOrigen;
	}

	public String getEstacionDestino() {
		return estacionDestino;
	}

	public void setEstacionDestino(String estacionDestino) {
		this.estacionDestino = estacionDestino;
	}

	public String getElegirVagon() {
		return elegirVagon;
	}

	public void setElegirVagon(String elegirVagon) {
		this.elegirVagon = elegirVagon;
	}

	public String getIngresaMetodoPago() {
		return ingresaMetodoPago;
	}

	public void setIngresaMetodoPago(String ingresaMetodoPago) {
		this.ingresaMetodoPago = ingresaMetodoPago;
	}


}
