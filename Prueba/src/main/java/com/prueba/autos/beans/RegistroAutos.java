package com.prueba.autos.beans;

import java.util.ArrayList;
import java.util.List;

public class RegistroAutos {
	
	private List<Autos> registrodelauto;
	private static RegistroAutos regaut = null;
	
	private RegistroAutos(){
		registrodelauto = new ArrayList<Autos>();
	}
	
	public static RegistroAutos getInstance() {
		if(regaut == null) {
			regaut = new RegistroAutos();
			return regaut;
		}
		else {
			return regaut;
		}
	}
	
	public void add(Autos aut) {
		registrodelauto.add(aut);
	}
	
	public String upDateAutos(Autos aut) {
		for (int i=0; i<registrodelauto.size(); i++)
		{
			Autos rgdela = registrodelauto.get(i);
			if(rgdela.getColor().equals(aut.getColor())) {
				registrodelauto.set(i, aut);
				return "Registro cumplido";
			}
		}
		return "registro no cumplido";
	}
	
	public String EliminarAuto(String color) {
		for(int i=0; i<registrodelauto.size(); i++)
		{
			Autos auts = registrodelauto.get(i);
			if(auts.getColor().equals(color)) {
				registrodelauto.remove(i);
				return "Eliminación exitosa";
			}
		}
		return "Eliminación insatisfactoria";
	}
	
	public List<Autos> getregistrodelauto(){
		return registrodelauto;
	}

}
