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
}
