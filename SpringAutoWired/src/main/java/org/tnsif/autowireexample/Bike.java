package org.tnsif.autowireexample;

public class Bike {
	
	//di in the form of objects
	Petrol p;

	//di using setters

	public void setP(Petrol p) {
		this.p = p;
	}
	
	//
	public void accept()
	{
		p.engine();
	}
}
