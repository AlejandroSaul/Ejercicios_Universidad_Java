package Seccion_10;

public class Seccion_10 {
	public void Clase139() {
		int[][] matriz = {{100,200,300},{400,500,600},{700,800,900}};
		int suma=0;
		for (int i = 0; i < 3; i++) {
			suma += matriz[i][i];
		}
		System.out.println(String.format("La suma es %d", suma));
	}

}
