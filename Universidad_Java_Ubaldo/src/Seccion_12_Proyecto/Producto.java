package Seccion_12_Proyecto;

public class Producto {
	private int idProducto;
	private String nombre;
	private double precio;
	private static int contador = 0;
	
	
	
	
	public Producto(String nombre, double precio) {		
		this.nombre = nombre;
		this.precio = precio;		
		idProducto = contador +1 ;
		contador +=1;
	}	
	
	public int getIdProducto() {
		return idProducto;
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
	
	
}
