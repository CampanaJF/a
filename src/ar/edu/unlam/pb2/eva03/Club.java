package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre=nombre;
		this.socios=new TreeSet<Deportista>();
		this.competencias=new TreeMap<String, Evento>();
	}
	
	public  void agregarDeportista(Deportista nuevo) {
		socios.add(nuevo);
	}
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
	
}
