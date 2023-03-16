package org.tnsif.objectsInjection;

public class Charger {

	
	//data members
	private String brand;
	private int voltage;
	private String type;
	
	//setters bcz to achieve the dependency
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void power()
	{
		System.out.println("DFetails related to charger: ");
		System.out.println(brand+" "+"voltage:"+voltage+"charger-type: "+type);
	}
	
}
