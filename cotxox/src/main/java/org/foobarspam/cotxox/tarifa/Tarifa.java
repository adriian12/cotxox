package org.foobarspam.cotxox.tarifa;

public class Tarifa {
	//Attribute
	private int id = 0;
	private int porcentajeComision = 20;
	
	private static double costeMilla = 1.35;
	private static double costeMinuto = 0.35;	
	private static double costeMinimo = 5;
	
	//Getters & setters
	public static double getCosteMinimo() {
		return costeMinimo;
	}
	public static double getCosteMilla() {
		return costeMilla;
	}
	public static double getCosteMinuto() {
		return costeMinuto;
	}
	
	//Methods
	public static double getCosteTotalEsperado(double distancia, double tiempo) {
		double coste = (distancia * getCosteMilla()) + (tiempo * getCosteMinuto());
		
		if(coste < getCosteMinimo())
			return getCosteMinimo();
		else
			return coste;
	}
}
