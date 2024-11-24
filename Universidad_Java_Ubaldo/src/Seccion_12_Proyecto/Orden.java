package Seccion_12_Proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Orden {
	List<Producto> productos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double calcularTotal() {
		double suma = 0;
		for (Producto producto : productos) {
			suma += producto.getPrecio();			
		} 
		return suma;
	}
	
	public void mostarOrden() {
		for(int i  = 0 ; i < productos.size(); i++) {
			System.out.print(String.format("id del producto: %d ", productos.get(i).getIdProducto()));
			System.out.print("Nombre de producto: "+ productos.get(i).getNombre());
			System.out.print(String.format("Precio: %.2f", productos.get(i).getPrecio()));
			System.out.println();
		}
	}
}
