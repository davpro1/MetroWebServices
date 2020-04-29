package controlador;

import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

import conexionBD.ConnectBD;
import modelo.Boleto;

public class BoletoDAO {


	private int idBoleto;
	private Date fechaPartida;
	private String estacionOrigen;
	private String estacionDestino;
	private String elegirVagon;
	private String ingresaMetodoPago;
	private ConnectBD conexionBD;
	
	public BoletoDAO(int idBoleto, String fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon, String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = Date.valueOf(fechaPartida);
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	public BoletoDAO(int idBoleto, Date fechaPartida, String estacionOrigen, String estacionDestino, String elegirVagon, String ingresaMetodoPago) {
		this.idBoleto = idBoleto;
		this.fechaPartida = fechaPartida;
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.elegirVagon = elegirVagon;
		this.ingresaMetodoPago = ingresaMetodoPago;
	}
	
	public BoletoDAO(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	
	public int getIdBoleto() {
		return idBoleto;
	}
	
	
	public boolean registrarBoleto() {
		boolean resultado = false;
		this.conexionBD = new ConnectBD();
		try {
			this.conexionBD.conect().createStatement().execute(
					"INSERT INTO Boleto (idBoleto,fechaPartida,estacionOrigen,estacionDestino,elegirVagon,ingresaMetodoPago) VALUES "
					+ "('"+this.idBoleto+"','"+this.fechaPartida+"','"+this.estacionOrigen+"','"+this.estacionDestino+"','"+this.elegirVagon
					+"','"+this.ingresaMetodoPago+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean actualizarBoleto() {
		boolean resultado = false;
		this.conexionBD = new ConnectBD();
		try {
			this.conexionBD.conect().createStatement().execute(
					"UPDATE Boleto SET "
					+ "fechaPartida = '"+this.fechaPartida+"'"
					+ ",estacionOrigen = '"+this.estacionOrigen+"'"
					+ ",estacionDestino = '"+this.estacionDestino+"'"
					+ ",elegirVagon = '"+this.elegirVagon+"'"
					+ ",ingresaMetodoPago = '"+this.ingresaMetodoPago+"'"
					+ "WHERE idBoleto = "+this.idBoleto);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public boolean eliminarBoleto() {
		boolean resultado = false;
		this.conexionBD = new ConnectBD();
		try {
			this.conexionBD.conect().createStatement().execute(
					"DELETE FROM Boleto WHERE idBoleto = "+this.idBoleto);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public Boleto consultarBoleto(int id) {
		Boleto boleto = null;
		this.conexionBD = new ConnectBD();
		try {
			ResultSet rs = this.conexionBD.conect().createStatement().executeQuery("SELECT * FROM Boleto WHERE idBoleto="+idBoleto);
			while(rs.next()) {
				boleto = new Boleto(rs.getInt("idBoleto"),rs.getDate("fechaPartida"),rs.getString("estacionOrigen"),
						rs.getString("estacionDestino"), rs.getString("elegirVagon"), rs.getString("ingresaMetodoPago"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boleto;
	}
	
	
	
	

}