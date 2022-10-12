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
	
	//Metodo de generacion de contraseña, con la longitud de esta como parametro
	public String generarContra(int longitud) {
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";	//cadena de caracteres posibles para construir contraseña
		String contraseña ="";
		
		for (int i = 0; i < longitud; i++) {	//bucle de generación de contraseña
			contraseña +=(caracteres.charAt((int)(Math.random() * caracteres.length()))); 	//usamos la funcion charAt que devuelve el indice de un caracter de la cadena
		}
		
		System.out.println(contraseña);
		
		return contraseña;
	}

	@Override
	public String toString() {
		return "Contraseña de longitud: " + longitud;
	}

}
