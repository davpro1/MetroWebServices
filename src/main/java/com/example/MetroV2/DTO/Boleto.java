package com.example.MetroV2.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;
import javax.persistence.Id;

@Entity
public class Boleto {
	@Id
	@GeneratedValue()
	private Integer Id;
	private Date FechaPartida;
	private String EstacionOrigen;
	private String EstacionDestino;
	private String ElegirVagon;
	private String ElegirMetodoPago;

}
