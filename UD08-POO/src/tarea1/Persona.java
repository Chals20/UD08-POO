package tarea1;

public class Persona {
	
	static final char SEXO = 'H';
	static final String NOMBRE = "";
	static final int EDAD = 0;
	static final double PESO = 0;
	static final int ALTURA = 0;
	

	//Atributos
	private String nombre;

	private int edad;

	private String dni;

	private char sexo;

	private double peso;

	private double altura;
	
	//Constructor por defecto
	public Persona(String dni) {
		this.nombre=NOMBRE;
		this.edad=EDAD;
		this.dni=dni;
		this.sexo=SEXO;
		this.peso=PESO;
		this.altura=ALTURA;
	}
	
	//Constructor con 3 parametros
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni="";
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}
	
	//Constructor con todos atributos como parametro
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}

	@Override
	public String toString() {
		return "Persona: nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura;
	}

	

}
