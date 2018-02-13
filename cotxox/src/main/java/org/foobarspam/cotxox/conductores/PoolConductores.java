package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	//Attributes
	private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();
	
	//Constructor
	public PoolConductores(ArrayList<Conductor> conductores) {
		for (Conductor conductor : conductores){
			this.poolConductores.add(conductor);
		}
	}
	
	//Getters & Setters
	public ArrayList<Conductor> getPoolConductores(){
		return this.poolConductores;
	}
	//Methods
	public Conductor asignarConductor(){
		
		// Nos aseguramos que sea un conductor aleatorio, para que no perdamos trabajadores.
				int numeroConductor = ThreadLocalRandom.current().nextInt(getPoolConductores().size());
				while(getPoolConductores().get(numeroConductor).getOcupado() == true){
					numeroConductor = ThreadLocalRandom.current().nextInt(getPoolConductores().size());
				}
				getPoolConductores().get(numeroConductor).setOcupado(true);
				return getPoolConductores().get(numeroConductor);
	}
}
