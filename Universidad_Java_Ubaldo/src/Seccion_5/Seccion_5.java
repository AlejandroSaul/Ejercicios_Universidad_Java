package Seccion_5;

import java.util.Scanner;

public class Seccion_5 {
	@SuppressWarnings("resource")
	public void clase48() {
		/**/
		Scanner escan = new Scanner(System.in);
		System.out.println("Digite el nombre de la receta");
		String nombreReceta = escan.nextLine();
		escan = new Scanner(System.in);
		System.out.println("Digite el nombre de los ingredientes");
		String ingredientes = escan.nextLine();
		escan = new Scanner(System.in);
		System.out.println("Digite el tiempo de preparacion");
		int tiempo = escan.nextInt();
		escan = new Scanner(System.in);
		System.out.println("Digite la dificultad");
		String dificultad = escan.nextLine();

		System.out.println(nombreReceta + " " + ingredientes + " " + tiempo + " " + dificultad);
	}
	
}
