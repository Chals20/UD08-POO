package tarea2;

public class Password {
	
	static final int LONGITUD = 8;
	
	//Atributos
	private int longitud;
	
	//Constructor por defecto
	public Password() {
		this.longitud=LONGITUD;
		generarContra(LONGITUD);
	}
	
	//Constructor con longitud por parametro
	public Password(int longitud) {
		this.longitud=longitud;
		generarContra(longitud);
	}
	
	//Metodo de generacion de contrase�a, con la longitud de esta como parametro
	public String generarContra(int longitud) {
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";	//cadena de caracteres posibles para construir contrase�a
		String contrase�a ="";
		
		for (int i = 0; i < longitud; i++) {	//bucle de generaci�n de contrase�a
			contrase�a +=(caracteres.charAt((int)(Math.random() * caracteres.length()))); 	//usamos la funcion charAt que devuelve el indice de un caracter de la cadena
		}
		
		System.out.println(contrase�a);
		
		return contrase�a;
	}

	@Override
	public String toString() {
		return "Contrase�a de longitud: " + longitud;
	}

}
