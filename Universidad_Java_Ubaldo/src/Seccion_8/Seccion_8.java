package Seccion_8;

import java.util.Scanner;

public class Seccion_8 {
	public void Clase109() {
		// numeros impares del 0-20
		int i = 0;
		do {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		} while (i < 20);
	}

	public void Clase115() {
		boolean bandera = true;
		int eleccion = 0;
		double saldo = 0;
		double retiro;
		double cantidad;
		Scanner escan = new Scanner(System.in);
		while (bandera) {
			System.out.println("*** Aplicacion de Cajero Automatico***");
			System.out.println("Operaciones que puedes realizar:");
			System.out.println("1. Consultar");
			System.out.println("2. Retirar");
			System.out.println("3. Depositar");
			System.out.println("4. Salir");
			System.out.println("Escoge una opcion:");
			eleccion = escan.nextInt();
			switch (eleccion) {
			case 1:
				System.out.println(String.format("Su saldo es de :$%.2f pesos", saldo));
				break;
			case 2:
				System.out.println("Digite la cantidad que desea retirar");
				retiro = escan.nextDouble();
				if (saldo > retiro) {
					saldo = saldo - retiro;
					break;
				} else {
					System.out.println("Saldo insuficiente");
					break;
				}
			case 3:
				System.out.println("Digite la cantidad que desea depositar");
				cantidad = escan.nextDouble();
				saldo = saldo + cantidad;
				break;
			case 4:
				bandera = false;
				break;
			}
			;

		}

	}
}
