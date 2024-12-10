package Seccion_14_Presentacion;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Seccion_14_dominio.Snack;
import Seccion_14_servicio.IServicioSnacks;
import Seccion_14_servicio.ServicioSnacks;



public class MaquinaSnacks {
	
public static void main(String[] args) {
maquinaSnacks();
}
private static List<Snack> carroCompras = new ArrayList<Snack>();
	
	
	
	public static void maquinaSnacks() {
		IServicioSnacks snacks = new ServicioSnacks();
		mostrarMenu(snacks);
	}
	
	private static void mostrarMenu(IServicioSnacks snacks) {
		
		System.out.println("*** Maquina de Sancks ***");
		System.out.println("--- Sancks en el Inventrio ---");
		
		ejecutarOpciones(snacks);
		
	}
	
	private static void ejecutarOpciones(IServicioSnacks snacks) {
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

		try {
			String ticket = "Ticket.txt";
			File archivo = new File(ticket);
			if(archivo.exists()) {
				archivo.delete();				
			}
			FileWriter escribir = new FileWriter(archivo,true);
						
			escribir.write("*** Ticket de Venta ***\n");
			for(Snack snk : carroCompras) {
				escribir.write("-"+snk.getNombre()+" $"+snk.getPrecio());
				total += snk.getPrecio();
				escribir.write("\n");				
			}
			escribir.write(String.format("Total -> $%.2f", total));
			escribir.close();
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
	
	private static List<Snack> agregarSnack(IServicioSnacks snacks) {
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
