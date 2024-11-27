package Seccion_13_Maquina_de_Snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
	private static List<Snack> listaSnack = new ArrayList<Snack>();
	
	public void agregarSnack(Snack snack) {
		listaSnack.add(snack);
	}
	
	public void mostarSnack() {
		for(Snack snack:listaSnack) {
			System.out.println(snack);
		}
	}
	
	public List<Snack> getSnack() {
		return listaSnack;
	}
}
