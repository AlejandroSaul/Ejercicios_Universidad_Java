package Seccion_13_Maquina_de_Snacks;

public class Main {

	public static void main(String[] args) {
		
		Snack botana1 = new Snack("Papas",70.0);
		Snack botana2 = new Snack("Refresco",50.0);
		Snack botana3 = new Snack("Sandwich",120.0);
		
		Snacks botanasEnMaquina = new Snacks ();
		
		botanasEnMaquina.agregarSnack(botana1);
		botanasEnMaquina.agregarSnack(botana2);
		botanasEnMaquina.agregarSnack(botana3);
		
		
		MaquinaSnacks maquinaSnacks = new MaquinaSnacks();
		maquinaSnacks.maquinaSnacks(botanasEnMaquina);

	}

}
