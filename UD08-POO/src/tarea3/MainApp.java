package tarea3;

public class MainApp {

	public static void main(String[] args) {

		Electrodomestico e1 = new Electrodomestico();
		System.out.println(e1.toString());
		
		Electrodomestico e2 = new Electrodomestico(140.5, 7);
		System.out.println(e2.toString());
		
		Electrodomestico e3 = new Electrodomestico(450, "AMARILLO", 'D', 15);
		System.out.println(e3.toString());
		
	}

}
