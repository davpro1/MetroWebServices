package modelo;



public class Estacion {

	private String zona;
	private String precio;
	private String nombre;
	private int linea;
	

	public Estacion(String zona, String precio, String nombre, int linea) {
		this.zona = zona;
		this.precio = precio;
		this.nombre = nombre;
		this.linea = linea;
	}
	
	public Estacion(int linea) {
		this.linea = linea;
	}


	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}
}
	
