package Seccion_14_servicio;

import java.util.ArrayList;
import java.util.List;


import java.io.Serializable;
import Seccion_14_dominio.Snack;



public class ServicioSnacks implements IServicioSnacks, Serializable {
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
