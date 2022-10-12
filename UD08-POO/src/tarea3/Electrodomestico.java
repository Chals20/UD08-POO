package tarea3;

public class Electrodomestico {

	static final int PRECIO_BASE = 100;
	static final int PESO = 5;
	static final char CONSUMO = 'F';
	static final String COLOR = "Blanco";
	
	//Atributos
	private double precioBase;
	
	private String color;
	
	private char consumo;
	
	private int peso;

	//Constructor por defecto
	public Electrodomestico() {
		super();
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}

	//Constructor con precio y peso
	public Electrodomestico(double precioBase, int peso) {
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumo, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumo(consumo);
		this.peso = peso;
	}
	

	//Comprobamos si el consumo es uno de los caracteres entre A-F y sino le introducimos el 'F' por defecto
	private char comprobarConsumo(char consumo) {

		switch(consumo) {
		
		case 'A':
			
			return Consumo.A.consumo;
			
		case 'B':
			
			return Consumo.B.consumo;
			
		case 'C':
			
			return Consumo.C.consumo;
			
		case 'D':
			
			return Consumo.D.consumo;
			
		case 'E':
			
			return Consumo.E.consumo;
			
		case 'F':
			
			return Consumo.F.consumo;
			
		default:
			
			return Consumo.F.consumo;
		}
	}

	//Comprobamos si el color esta entre los colores definidos en el enum y sino está le introducimos el color blanco por defecto
	private String comprobarColor(String color) {
		
		switch (color.toLowerCase()) {	//el toLowerCase hace que la palabra introducida este en minusculas (al ser Java case sensitive, nos evitamos problemas con posibles mayusculas)
		
		case "blanco":

			return Colores.BLANCO.colores;

		case "negro":
			
			return Colores.NEGRO.colores;
			
		case "rojo":
			
			return Colores.ROJO.colores;
			
		case "azul":
			
			return Colores.AZUL.colores;
			
		case "gris":
			
			return Colores.GRIS.colores;
			
		default:
			
			return Colores.BLANCO.colores;
		}
	}

	@Override
	public String toString() {
		return "Electrodomestico:\n Precio: " + precioBase + "\n Color: " + color + "\n Consumo: " + consumo + "\n Peso: " + peso;
	}

	
}