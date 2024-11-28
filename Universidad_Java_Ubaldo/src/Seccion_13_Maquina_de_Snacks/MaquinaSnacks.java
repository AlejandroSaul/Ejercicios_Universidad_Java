package Seccion_13_Maquina_de_Snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
	
	private static List<Snack> carroCompras = new ArrayList<Snack>();
	
	
	public static void maquinaSnacks(Snacks snacks) {
		mostrarMenu(snacks);
	}
	
	private static void mostrarMenu(Snacks snacks) {
		
		System.out.println("*** Maquina de Sancks ***");
		System.out.println("--- Sancks en el Inventrio ---");
		
		ejecutarOpciones(snacks);
		
	}
	
	private static void ejecutarOpciones(Snacks snacks) {
		boolean bandera = true;
		int opcion = 0;
		Scanner escaner = new Scanner(System.in);
		while(bandera) {
			try {
				
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
						comprarSnack(snacks.getSnack());
						break;
					case 2: 
						mostarTicket();
						break;
					case 3:
						agregarSnack(snacks);
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
	
	private static List<Snack> comprarSnack(List<Snack> snack) {
		System.out.println("Digite el id del snack que desea comprar");
		boolean bandera = true;
		Scanner escan = new Scanner(System.in);
		int opcion = escan.nextInt();
		while(bandera) {
			try {
				for(Snack snk : snack) {
					if(snk.getIdSnack() == opcion) {
						carroCompras.add(snk);
					}
				}
				bandera = false;
				return carroCompras;				
			}catch(Exception e){
				System.out.println("Error: " + e);
			}			
		}
		return carroCompras;
	}
	
	private static void mostarTicket() {
		double total = 0;
		System.out.println("*** Ticket de Venta ***");
		for(Snack snk : carroCompras) {
			System.out.println("-"+snk.getNombre()+" - $"+snk.getPrecio());
			total += snk.getPrecio();
		}
		System.out.println(String.format("Total -> $%.2f", total));
		System.out.println();
	}
	
	private static List<Snack> agregarSnack(Snacks snacks) {
		Scanner escan = new Scanner(System.in);
		boolean bandera = true;
		while(bandera) {
			try {
				System.out.println("Digite el nombre del nuevo snack");
				String nombre = escan.nextLine();
				escan = new Scanner(System.in);
				System.out.println("Digite el precio del nuevo snack");
				double precio = escan.nextDouble();
				Snack snack = new Snack(nombre, precio);
				snacks.agregarSnack(snack);
				bandera= false;
			}catch(Exception e){
				System.out.println("Error: "+e);
			}
		}
		
		return snacks.getSnack();
	}
}
