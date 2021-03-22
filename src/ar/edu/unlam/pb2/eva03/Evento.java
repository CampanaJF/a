package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipoDeEvento;
	private Integer numeroDeInscriptos;
	private Map<Integer, Deportista> participantes;
	private String descripcion;
	
	public Evento(TipoDeEvento tipoDeEvento, String descripcion) {
		this.tipoDeEvento=tipoDeEvento;
		this.descripcion=descripcion;
		this.numeroDeInscriptos=0;
		this.participantes=new TreeMap<Integer,Deportista>();
		
	}
	
	public TipoDeEvento getTipoDeEvento() {
		return this.tipoDeEvento;
	}
	
	public Integer getNumeroDeInscriptos() {
		return this.numeroDeInscriptos;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void agregarParticipantes(Deportista deportista) {
		this.participantes.put(this.numeroDeInscriptos++, deportista);
	}
	
	
}
