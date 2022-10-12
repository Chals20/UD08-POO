package tarea4;

public class Serie {

	static final int TEMPORADAS = 3;
	static final boolean ENTREGADO = false;
	static final String TITULO = "";
	static final String GENERO = "";
	static final String CREADOR = "";	
	
	//Atributos
	private String titulo;
	
	private int numTemporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;

	public Serie() {
		this.numTemporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.titulo = TITULO;
		this.genero = GENERO;
		this.creador = CREADOR;
	}

	public Serie(String titulo, String creador) {
		this.numTemporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie:\n Título: " + titulo + "\n Número temporadas: " + numTemporadas + "\n Entregado: " + entregado + "\n Género: "+ genero + "\n Creador: " + creador;
	}
	
	
	
	
	
	
}
