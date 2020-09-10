package Exa1;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(5);
		IServicio servicio = Factory.returnProxy(usuario);
		servicio.leer(); //<---
		servicio.escribir();
		servicio.actualizar();
		servicio.eliminar();
		
	}

}
