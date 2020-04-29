package modelo;

import java.sql.Date;

public class Boleto {


	private int idBoleto;
	private Date fechaPartida;
	private String estacionOrigen;
	private String estacionDestino;
	private String elegirVagon;
	private String ingresaMetodoPago;
	
	public Boleto(int idBoleto, String fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon, String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = Date.valueOf(fechaPartida);
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	public Boleto(int idBoleto, Date fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon, String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = fechaPartida;
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	public Boleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	


	public Boleto(Date date, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
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
