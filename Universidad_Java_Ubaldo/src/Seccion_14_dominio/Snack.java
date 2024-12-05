package Seccion_14_dominio;

public class Snack {
	private static int contadorSacks=0;
	private int idSnack;
	private String nombre;
	private double precio;
	
	public Snack(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.idSnack = ++contadorSacks;
	}
	
	

	public int getIdSnack() {
		return idSnack;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Snack [idSnack=" + idSnack + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
