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
		String mensaje = vistaMar ? "Habitacion con vista al mar: Si :)" : "Habitacion sin vista al mar :(";

		System.out.println(mensaje);

	}

	public void Clase89() {
		Scanner escan = new Scanner(System.in);
		System.out.println("Digite un numero");
		int primerNumero = escan.nextInt();
		System.out.println("Digite otro numero");
		int segundoNumero = escan.nextInt();

		int mayorNumero = primerNumero > segundoNumero ? primerNumero : segundoNumero;
		System.out.println(String.format("el mayor numero es %d", mayorNumero));
	}

	public void Clase91() {
		System.out.println("Seleccione un numero del 1 al 12");
		Scanner escn = new Scanner(System.in);
		try {
			int estacion = escn.nextInt();
			switch (estacion) {
			case 1,2,12:
				System.out.println("Es Invierno");
			break;
			case 3,4,5:
				System.out.println("Es primavera");
			break;
			case 6,7,8:
				System.out.println("Es verano");
			break;
			case 9,10,11:
				System.out.println("Es otoño");
			break;
			}

		} catch (Exception e) {

		}
	}
	
	
	public void Clase97() {
		Scanner escan = new Scanner(System.in);
		System.out.println("Digite un numero entre 1 y 10");
		int numero = escan.nextInt();
		

		String letra = switch(numero) {
		case 1,2,3,4,5 -> "F";
		case 6,7 -> "D";
		case 8 -> "C";
		case 9 -> "B";
		case 10 -> "A";
		default -> "Valor desconocido";
		};
		
		System.out.println(letra);
			
	}
	
	public void Clase99() {
		System.out.println("*** Sisema de Envios ***");
		System.out.println("Ingresa el destino del paquete (1.- nacional/ 2.-internacional):");
		Scanner escan = new Scanner(System.in);
		Scanner escan2 = new Scanner(System.in);
		int eleccion = escan.nextInt();
		System.out.println("Ingrese el peso del paquete en kg");
		double peso = escan2.nextDouble();
		double precio;
		if(eleccion == 1) {
			precio = peso * 10;
		}else {
			precio = peso * 20;
		}
		
		System.out.println(String.format("El costo de envio del paquete es : $%.2f", precio));
	}
	
	public void Clase101() {
		final String contrasena = "123";
		final String usuario = "alex";
		
		Scanner  escaner = new Scanner(System.in);
		
		System.out.println("Digite el usuario:");
		String usuarioSel = escaner.nextLine();
		System.out.println("Digite la contraseña");
		escaner = new Scanner(System.in);
		String contrasenaSel = escaner.nextLine();
		
		boolean validacion1 = usuarioSel.equals(usuario);
		boolean validadcion2 = contrasenaSel.equals(contrasena);
		boolean respuesta1 = true;
		boolean respuesta2 = false;
		int num;
		if(validacion1 && validadcion2) {
			num = 1;
		}else if(!validacion1 && validadcion2){
			num = 2;
		}else if(validacion1 && !validadcion2) {
			num = 3;
		}else {
			num = 4;
		}
		
		String respuesta = switch(num) {
		case 1 -> "Usuario y password validos";
		case 2 -> "Usuario invalido";
		case 3 -> "Password invalido";
		case 4 -> "Usuario y password invalidos";
		default-> "No exite la opcion";
		};
		
		System.out.println(respuesta);
		if(num==1) {
			System.out.println("*** Bienvenido al Sistema ***");
		}
	}
}
