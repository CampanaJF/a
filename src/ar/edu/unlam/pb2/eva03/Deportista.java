package ar.edu.unlam.pb2.eva03;

public class Deportista implements Comparable<Deportista> {

	protected Integer numeroDeSocio;
	protected String nombre;
	protected String estilo;
	
	public Deportista(Integer numero, String nombre) {
		super();
		this.numeroDeSocio = numero;
		this.nombre = nombre;
	}
	
	
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEstilo() {
		return estilo;
	}


	@Override
	public int compareTo(Deportista a) {
		int numero=numeroDeSocio.compareTo(a.getNumeroDeSocio());
		
		return numero;
	}
 

	
	
	
	
	
}