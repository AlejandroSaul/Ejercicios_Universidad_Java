package Seccion_8;

import java.util.Iterator;
import java.util.Random;
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
			resultado = 0;
			break;
		}
		System.out.println(String.format("El resultado es : %.2f", resultado));
	}

	public void Clase119() {

		Scanner escan = new Scanner(System.in);
		String pass;
		boolean bandera = true;
		do {
			try {
				System.out.println("Digite una contraseña");
				pass = escan.nextLine();
				if (pass.length() > 6) {
					System.out.println("Password valido");
					bandera = false;
				} else {
					System.out.println("Contraseña demasiada pequeña intente nuevamente");
				}
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}

		} while (bandera);

	}

	public void Clase121() {
		Random random = new Random();
		int numero = random.nextInt(1, 50);
		int adivina;
		Scanner escan = new Scanner(System.in);
		for (int i = 1; i < 10; i++) {
			System.out.println("Digite un numero");
			adivina = escan.nextInt();
			if (i == 10) {
				System.out.println("Se terminaron los intentos");
				break;
			}

			if (adivina == numero) {
				System.out.println("Felicidades, acertó");
				System.out.println(String.format("El numero de intentos fue : %d", i));
				break;
			} else if (adivina < numero) {
				System.out.println("El numero que eligio es menor al numero a adivinar");
			} else if (adivina > numero) {
				System.out.println("El numero que eligio es mayor al numero a adivinar");
			}
		}
	}

	public void Clase123() {
		char caracter1 = ' ';
		char caracter2 = '*';

		Scanner escaner = new Scanner(System.in);
		System.out.println("Digite el numero de filas");
		int numeroFilas = escaner.nextInt();

		int numeroEspaciosInicial = numeroFilas - 1;
		int asteriscos = 1;

		for (int i = 0; i < numeroFilas; i++) {
			for (int j = 0; j < numeroEspaciosInicial; j++) {
				System.out.print(caracter1);
			}
			numeroEspaciosInicial -= 1;
			for (int j = 0; j < asteriscos; j++) {
				System.out.print(caracter2);
			}
			asteriscos += 2;
			System.out.println();
		}

	}

}
