package Seccion_9;

import java.util.Scanner;

public class Seccion_9 {
	public void Clase132(){
		System.out.println("¿Cuantas calificacines deseas agregar?");
		Scanner escan = new Scanner(System.in);
		int cantidad = escan.nextInt();
		double sumatoria=0;
		
		int[] arreglo = new int[cantidad];
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Digite una calificacion");
			arreglo[i] = escan.nextInt();
			sumatoria += arreglo[i];
		}
		
		double promedio = sumatoria/arreglo.length;
		System.out.println(String.format("El promedio es %.2f", promedio));
	}
}
