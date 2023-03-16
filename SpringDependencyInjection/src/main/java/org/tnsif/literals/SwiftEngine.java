package org.tnsif.literals;

public class SwiftEngine implements IEngine{

	
	private String company;
	private double cost;
	public double cost() {
		
		return cost;
	}
	
	//di using constructor
	
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}



	//di setters
	public String display() {
		// TODO Auto-generated method stub
		return "japan";
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "origin of company" +company+fuel;
	}
	

}
