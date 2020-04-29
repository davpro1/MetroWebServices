package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.ConnectBD;
import modelo.Estacion;

public class EstacionDAO {


	private String zona;
	private String precio;
	private String nombre;
	private int linea;
	private ConnectBD conexionBD;
	
	public EstacionDAO(String zona, String precio, String nombre, int linea) {
		this.zona = zona;
		this.precio = precio;
		this.nombre = nombre;
		this.linea = linea;
	}
	
	public EstacionDAO(int linea) {
		this.linea = linea;
	}
	
	
	public Estacion consultarEstacion(int id) {
		Estacion estacion = null;
		this.conexionBD = new ConnectBD();
		try {
			ResultSet rs = this.conexionBD.conect().createStatement().executeQuery("SELECT Estaciones.* FROM Estaciones WHERE linea="+linea);
			while(rs.next()) {
				estacion = new Estacion(rs.getString("zona"),
						rs.getString("precio"), rs.getString("nombre"), rs.getInt("linea"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return estacion;
	}
}
