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

	public void Clase117() {
		System.out.println("*** Calculadora en Java ***");
		System.out.println("Operacion que puedes relizar:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Salir");
		System.out.println("Escoja una opcion:");
		Scanner escan = new Scanner(System.in);
		int eleccin = escan.nextInt();
		double numero1;
		double numero2;
		double resultado;

		switch (eleccin) {
		case 1:
			System.out.println("Dame el numero 1");
			numero1 = escan.nextDouble();
			System.out.println("Dame el numero 2");
			numero2 = escan.nextDouble();
			resultado = numero1 + numero2;
			break;
		case 2:
			System.out.println("Dame el numero 1");
			numero1 = escan.nextDouble();
			System.out.println("Dame el numero 2");
			numero2 = escan.nextDouble();
			resultado = numero1 + numero2;
			break;
		case 3:
			System.out.println("Dame el numero 1");
			numero1 = escan.nextDouble();
			System.out.println("Dame el numero 2");
			numero2 = escan.nextDouble();
			resultado = numero1 + numero2;
			break;
		case 4:
			System.out.println("Dame el numero 1");
			numero1 = escan.nextDouble();
			System.out.println("Dame el numero 2");
			numero2 = escan.nextDouble();
			resultado = numero1 + numero2;
			break;
		case 5:
			System.out.println("Dame el numero 1");
			numero1 = escan.nextDouble();
			System.out.println("Dame el numero 2");
			numero2 = escan.nextDouble();
			resultado = numero1 + numero2;
			break;
		default:
			System.out.println("No e suna opcion");
			resultado=0;
			break;
		}
		System.out.println(String.format("El resultado es : %.2f", resultado));
	}
}
