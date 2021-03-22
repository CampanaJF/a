package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

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

	public void crearEvento(TipoDeEvento tipoDeEvento, String descripcion) {
		Evento eventoNuevo=new Evento(tipoDeEvento,descripcion);
		competencias.put(descripcion, eventoNuevo);
		
	}

	public Object inscribirEnEvento(String descripcion, Deportista deportista) throws NoEstaPreparado {
		
		Integer valor=0;
		
		switch(this.competencias.get(descripcion).getTipoDeEvento()) {
		
		case CARRERA_10K:
			if(deportista instanceof Corredor|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
			break;
		case CARRERA_21K:
			if(deportista instanceof Corredor|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
			
			break;
		case CARRERA_42K:
			if(deportista instanceof Corredor|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case CARRERA_5K:
			if(deportista instanceof Corredor|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(deportista instanceof Nadador|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case CARRERA_NATACION_EN_PICINA:
			if(deportista instanceof Nadador|| deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case DUATLON:
			if(deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case TRIATLON_IRONMAN:
			if(deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();

			break;
		case TRIATLON_MEDIO:
			if(deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case TRIATLON_OLIMPICO:
			if(deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		case TRIATLON_SHORT:
			if(deportista instanceof Triatleta) {
				competencias.get(descripcion).agregarParticipantes(deportista);}
			else {
				throw new NoEstaPreparado();}
			valor=competencias.get(descripcion).getNumeroDeInscriptos();
		
			break;
		
		}
		
		  return valor;
		
		
		
	}
	
}
