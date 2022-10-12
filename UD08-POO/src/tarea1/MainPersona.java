package tarea1;

public class MainPersona {

	public static void main(String[] args) {

		Persona personaPorDefecto = new Persona("39765431H");
		System.out.println(personaPorDefecto.toString());
		
		Persona personaAlgunAtributo = new Persona("Hector", 33, 'H');
		System.out.println(personaAlgunAtributo.toString());
		
		Persona personaTodoAtributos = new Persona("Maria", 45, "48265098G", 'M', 77.2, 1.71);
		System.out.println(personaTodoAtributos.toString());
	}

}
