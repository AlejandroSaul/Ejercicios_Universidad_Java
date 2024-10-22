package Seccion_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Seccion_6 {
	public void clase56() {
		/*
		 * Se solicita un programa para generear un valor de id(Identificador) unico
		 * para cada persona
		 * 
		 * el programa debe solicitar al usuario Nombre Apellido Año de nacimiento El
		 * programa debera generar un velos aleatorio de 4 digitos entre 1 y 9999. si el
		 * numero generado es menor a 4 digitos se debe completar el valor con ceros a
		 * la izquierda
		 * 
		 * Finalmente con los datos obtenidos debe generr un valor de ID unico uniendo
		 * los valores de la siguiete forma Nombre: Juan -> JU Aleatorio: 0736 Apellido:
		 * Perez -> PE Año: 1995 -> 95 IDUnico = JUPE950736
		 */
		List<Character> lista = new ArrayList<Character>();

		Scanner escaner = new Scanner(System.in);
		System.out.println("Digite un nombre");
		String nombre = escaner.nextLine().toUpperCase();
		lista.add(nombre.charAt(0));
		lista.add(nombre.charAt(1));

		escaner = new Scanner(System.in);
		System.out.println("Digite un apellido");
		String apellido = escaner.nextLine().toUpperCase();
		lista.add(apellido.charAt(0));
		lista.add(apellido.charAt(1));

		escaner = new Scanner(System.in);
		System.out.println("Digite el año de nacimiento");
		int año = escaner.nextInt();
		String añoString = String.valueOf(año);
		lista.add(añoString.charAt(añoString.length() - 2));
		lista.add(añoString.charAt(añoString.length() - 1));

		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(9998) + 1;

		String numeroAleatorioString = String.format("%04d", numeroAleatorio);
		lista.add(numeroAleatorioString.charAt(0));
		lista.add(numeroAleatorioString.charAt(1));
		lista.add(numeroAleatorioString.charAt(2));
		lista.add(numeroAleatorioString.charAt(3));
		
		String idUnico= lista.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ","");
				
		System.out.println(String.format("El id unico es %S", idUnico));
				
	}
	
	public void clase69() {
		/*Crea un programa para validar el usuario y password proporcinados por el
		 * usuario
		 * crea 2 constantes con los Valores correctos y posteiomente compara
		 * que el usuario y el password proporcionados por elusuario sean validos
		 * 
		 * debe solicitar el usuario y el password al usuario y si son iguales que
		 * los calores correctos almacenados en las constantes debe imprimir True
		 * de lo contrario debe imprimir False*/
		
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
		
		if(validacion1 && validadcion2) {
			System.out.println(respuesta1);
		}else {
			System.out.println(respuesta2);
		}
	}
}
