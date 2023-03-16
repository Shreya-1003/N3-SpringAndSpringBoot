package org.tnsif.objectsInjection;

public class CellPhone {

//	2.di in the form of objects
	
	Charger charger;

	//setters 
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//injecting the object of charger class
	public void accept()
	{
		charger.power();
	}
	
	
	
}
