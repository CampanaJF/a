package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public abstract class Deportista implements Comparable<Deportista> {

	protected Integer numeroDeSocio;
	protected String nombre;
	protected String estilo;
	protected Integer cantidadDeKilometrosEntrenados;
	protected TipoDeBicicleta tipoBici;
	
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
	
	@Override
	public int compareTo(Deportista a) {
		int numero=numeroDeSocio.compareTo(a.getNumeroDeSocio());
		
		return numero;
	}
 

	
	
	
	
	
}
