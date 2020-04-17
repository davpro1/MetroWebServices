package controlador;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


import database.SQLDatabaseConnection;
import modelo.BoletoM;


public class BoletoC {
	
	private int idBoleto;
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


	public SQLDatabaseConnection getDatabase() {
		return database;
	}


	public void setDatabase(SQLDatabaseConnection database) {
		this.database = database;
	}



	private Date fechaPartida;
	private String estacionOrigen;
	private String estacionDestino;
	private String elegirVagon;
	private String ingresaMetodoPago;
	
	private SQLDatabaseConnection database;
	
	
	public BoletoC(int idBoleto, String fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon,String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = Date.valueOf(fechaPartida);
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	
	public BoletoC(String fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon,String ingresaMetodoPago) {
		this.fechaPartida = Date.valueOf(fechaPartida);
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	
	public BoletoC(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public int getIdBoleto() {
		return idBoleto;
	}
	
	
	

	public boolean registrarBoleto() {
		boolean resultado = false;
		this.database = new SQLDatabaseConnection();
		try {
			this.database.conect().createStatement().execute(
					"INSERT INTO Boletos (fechaPartida,estacionOrigen,estacionDestino,elegirVagon,ingresaMetodoPago) VALUES "
					+ "('"+this.fechaPartida+"','"+this.estacionOrigen+"','"+this.estacionDestino+"','"+this.elegirVagon
					+"','"+this.ingresaMetodoPago+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	

	public boolean actualizarBoleto() {
		boolean resultado = false;
		this.database = new SQLDatabaseConnection();
		try {
			this.database.conect().createStatement().execute(
					"UPDATE Boletos SET "
					+ "fechaPartida = '"+this.fechaPartida+"'"
					+ "estacionOrigen = '"+this.estacionOrigen+"'"
					+ "estacionDestino = '"+this.estacionDestino+"'"
					+ "elegirVagon = '"+this.elegirVagon+"'"
					+ "ingresaMetodoPago = '"+this.ingresaMetodoPago+"'"
					+ "WHERE idBoleto = "+this.idBoleto);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	

	public boolean eliminarBoleto() {
		boolean resultado = false;
		this.database = new SQLDatabaseConnection();
		try {
			this.database.conect().createStatement().execute(
					"DELETE FROM Boletos WHERE idBoleto = "+this.idBoleto);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	


	

	public BoletoM consultarBoleto(int id) {
		BoletoM boleto = null;
		this.database = new SQLDatabaseConnection();
		try {
			ResultSet rs = this.database.conect().createStatement().executeQuery("SELECT * FROM Boletos WHERE idBoleto="+idBoleto);
			while(rs.next()) {
				boleto = new BoletoM(rs.getDate("fechaPartida"),rs.getString("estacionOrigen"),
						rs.getString("estacionDestino"), rs.getString("elegirVagon"), rs.getString("ingresaMetodoPago"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boleto;
	}
	

}