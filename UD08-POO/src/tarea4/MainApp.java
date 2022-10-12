package tarea4;

public class MainApp {

	public static void main(String[] args) {

		Serie s1 = new Serie();
		System.out.println(s1.toString());
		
		Serie s2 = new Serie("Dark", "Jan Schmidt");
		System.out.println(s2.toString());
		
		Serie s3 = new Serie("The Simpsons", 22, true, "Animación", "Matt Groening");
		System.out.println(s3.toString());

	}

}
