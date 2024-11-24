package Seccion_12_Proyecto;

public class Main {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Crema",30);
		Producto producto2 = new Producto("Leche",27);
		Producto producto3 = new Producto("Agua",10);
		Producto producto4 = new Producto("Manzana",5);

		
		
		Orden pedido1 = new Orden();
		
		pedido1.agregarProducto(producto1);
		pedido1.agregarProducto(producto2);
		pedido1.agregarProducto(producto3);
		pedido1.agregarProducto(producto4);
		
		pedido1.mostarOrden();
		System.out.println(pedido1.calcularTotal());
		
		
	}

}
