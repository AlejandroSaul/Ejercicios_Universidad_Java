package Seccion_11;

public class Seccion_11 {
	public void Clase146() {
		//Crear una funcion recursiva para imprimir del 1 al 5
		int x = 1;
		funcionRecursiva(x);
	}
	public int funcionRecursiva(int x) {
		if(x<=5) {
			System.out.println(String.format("El valor es %d", x));
			x++;
			funcionRecursiva(x);
		}
		
		return	x;
	}
}
