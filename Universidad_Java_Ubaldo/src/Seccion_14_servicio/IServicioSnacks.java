package Seccion_14_servicio;

import java.util.List;

import Seccion_14_dominio.Snack;



public interface IServicioSnacks {
	
	public void agregarSnack(Snack snack);
	
	public void mostarSnack();
	
	public List<Snack> getSnack();
}
