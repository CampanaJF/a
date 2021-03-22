package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	public Nadador(Integer numero, String nombre,String estilo) {
		super(numero, nombre);
		this.estilo=estilo;
	}

	@Override
	public String getEstiloPreferido() {
		
		return this.estilo;
	}


	
	
	

}
