package Seccion_13_Maquina_de_Snacks;

import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
	
	
	
	
	public static void maquinaSnacks(Snacks snacks) {
		mostrarMenu(snacks);
	}
	
	private static void mostrarMenu(Snacks snacks) {
		boolean bandera = true;
		int opcion = 0;
		Scanner escaner = new Scanner(System.in);
		while(bandera) {
			try {
				System.out.println("*** Maquina de Sancks ***");
				System.out.println("--- Sancks en el Inventrio ---");
				snacks.mostarSnack();
				
				System.out.println("Menu:");
				System.out.println("1. Comprar snack");
				System.out.println("2. Mostrar Ticket");
				System.out.println("3. Agregar Nuevo Snack");
				System.out.println("4. Salir");
				System.out.println("Elige una opcion:");
				opcion = escaner.nextInt();
				switch(opcion) {
					case 1:
						comprarSnack();
						break;
					case 2: 
						mostarTicket();
						break;
					case 3:
						agregarSnack();
						break;
					case 4:
						bandera = false;
						break;
				}					
						
			}catch (Exception e){
				System.out.println("Error:" + e);
			}
		}
		
		
	}
	
	private static void ejecutarOpciones() {
		
	}
	
	private static void comprarSnack() {
		
	}
	
	private static void mostarTicket() {
		
	}
	
	private static void agregarSnack() {
		
	}
}
