package Exa1;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(2);
		IServicio servicio = new ProxyServicio(new Servicio(),usuario);
		servicio.leer(); //<---
		servicio.escribir();
		servicio.actualizar();
		servicio.eliminar();
		

		
	}

}
