package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	//Attributes
	private String nombre = "";
	private String modelo = "";
	private String matricula = "";
	private double valoracionMedia = 0.0;
	private ArrayList<Double> valoraciones = new ArrayList<Double>();
	private Boolean ocupado = false;
	
	
	//Constructor 
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters & Setters
	public ArrayList<Double> getValoraciones() {
		return this.valoraciones;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Boolean getOcupado() {
		return this.ocupado;
	}
	public double getValoracionMedia() {
		return this.valoracionMedia;
	}
	
	public void setValoracion(double valoracion) {
		double sumaValoraciones = 0;
		getValoraciones().add(valoracion);
		
		for (Double valor : getValoraciones())
			sumaValoraciones = sumaValoraciones + valor;
		
		valoracionMedia = sumaValoraciones / getValoraciones().size();
		
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public double getValoracion() {
		// TODO Auto-generated method stub
		return this.valoracionMedia;
	}

	public boolean isOcupado() {
		return getOcupado();
	}
}
