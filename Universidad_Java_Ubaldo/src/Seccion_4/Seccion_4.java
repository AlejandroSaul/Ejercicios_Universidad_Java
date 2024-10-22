package Seccion_4;

public class Seccion_4 {
	public void Clase42(){
        // resultado = ubaldo.acosta.soto@globalmetoring.com.mx
        String nombre = "Ubaldo Acosta Soto";
        String empresa = "Global Mentoring";
        String dominio = "com.mx";
        
        String nombreFin = nombre.replace(" ", ".").toLowerCase();
        String empresaFin = empresa.replace(" ", "").toLowerCase();
        String resultado = nombreFin + "@" + empresaFin + "." + dominio;
     System.out.println(resultado); 
    }
}
