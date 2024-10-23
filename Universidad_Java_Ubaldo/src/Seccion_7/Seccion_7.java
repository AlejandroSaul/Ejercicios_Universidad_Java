package Seccion_7;

import java.util.Scanner;

public class Seccion_7 {

	public void Clase81() {
		int montoMinimo = 1000;
		boolean miembro = false;

		Scanner esca = new Scanner(System.in);
		System.out.println("Digite el monto comprado");
		double monto = 0f;
		monto = esca.nextDouble();
		System.out.println("Es mienbro? \n 1.-Si\n 2.-No ");
		int eleccin = esca.nextInt();
		switch (eleccin) {
		case 1:
			if (monto > montoMinimo) {
				double descuento = monto * .1;
				System.out.println("El descuento es de $" + descuento);
				monto = monto - descuento;
				System.out.println("El monto a pagar es: $" + monto);
			} else {
				double descuento = monto * .05;
				System.out.println("El descuento es de $" + descuento);
				monto = monto - descuento;
				System.out.println("El monto a pagar es: $" + monto);
			}
			break;
		case 2:
			System.out.println("El monto a pagar es: $" + monto);
			break;
		}
	}
	
	public void Clase87() {
		Scanner escan = new Scanner(System.in);
		
		System.out.println("*** Sistema de Reserva de Hotel");
		System.out.print("Nombre del Cliente: ");
		String nombre = escan.nextLine();
		escan = new Scanner(System.in);
		System.out.print("Dias de estadia: ");
		int diasEstadia = escan.nextInt();
		System.out.print("Con vista al mar (true/false)? ");
		boolean vistaMar = escan.nextBoolean();
		
		double conVistaMar = 190.50;
		double sinVistaMar = 150.50;
		
		double costoTotal = vistaMar ? conVistaMar * diasEstadia : sinVistaMar * diasEstadia;
		
		
		System.out.println("-----Detalles de la resevacion-------");
		System.out.println(String.format("Cliente : %S", nombre));
		System.out.println(String.format("Dias de estadia %d", diasEstadia));
		System.out.println(String.format("Costo Total $ %f", costoTotal));
		String mensaje = vistaMar ? "Habitacion con vista al mar: Si :)"  : "Habitacion sin vista al mar :(";

		System.out.println(mensaje);
		
	}
	
	public void Clase89() {
		Scanner escan = new Scanner(System.in);
		System.out.println("Digite un numero");
		int primerNumero = escan.nextInt();
		System.out.println("Digite otro numero");
		int segundoNumero = escan.nextInt();
		
		int mayorNumero = primerNumero>segundoNumero ? primerNumero : segundoNumero;
		System.out.println(String.format("el mayor numero es %d", mayorNumero));
	}
}
