package Seccion_13_Maquina_de_Snacks;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacks {
	private static List<Snack> listaSnack = new ArrayList<Snack>();
	static {
		listaSnack.add(new Snack("Papas",70.0));
		listaSnack.add(new Snack("Refresco",50.0));
		listaSnack.add(new Snack("Sandwich",120.0));		
	}
	
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
