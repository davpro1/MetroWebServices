package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import database.SQLDatabaseConnection;


public class ClienteC {
	private int idCliente;
	public int getIdCliente() {
		return idCliente;
	}
	
	public ClienteC(int idCliente) {
		this.idCliente = idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public SQLDatabaseConnection getDatabase() {
		return database;
	}


	public void setDatabase(SQLDatabaseConnection database) {
		this.database = database;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	
	
	private SQLDatabaseConnection database;
	

	public ClienteC(String nombre,String apellido, String telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	

	public ClienteC(int idCliente, String nombre,String apellido, String telefono, String correo) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	

	public boolean registrarCliente() {
		boolean resultado = false;
		this.database = new SQLDatabaseConnection();
		try {
			this.database.conect().createStatement().execute(
					"INSERT INTO clientes (nombre,apellido,telefono,correo) VALUES "
					+ "('"+this.nombre+"','"+this.apellido+"','"+this.telefono+"','"+this.correo
					+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	

	public boolean actualizarCliente() {
		boolean resultado = false;
		this.database = new SQLDatabaseConnection();
		try {
			this.database.conect().createStatement().execute(
					"UPDATE clientes SET "
					+ "nombre = '"+this.nombre+"'"
					+ "apellido = '"+this.apellido+"'"
					+ "telefono = '"+this.telefono+"'"
					+ "correo = '"+this.correo+"'"
					+ "WHERE idCliente = "+this.idCliente);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	


	public String getNombre() {
		this.database = new SQLDatabaseConnection();
		if (nombre == null) {
			try {
				this.database.conect().createStatement().execute(
						"SELECT nombre FROM Clientes WHERE idCliente = "+this.idCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return nombre;
	}

	


	public String getApellido() {
		this.database = new SQLDatabaseConnection();
		if (apellido == null) {
			try {
				this.database.conect().createStatement().execute(
						"SELECT apellido FROM Clientes WHERE idCliente = "+this.idCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return apellido;
	}
	
	public boolean verificarIdCliente() {
		boolean existe = false;
		this.database = new SQLDatabaseConnection();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE idCliente = "+this.idCliente;
				final PreparedStatement ps = this.database.conect().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				    final int count = resultSet.getInt(1);
				}
				
				
				//this.database.conect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
}

