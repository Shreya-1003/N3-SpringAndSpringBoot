package org.tnsif.objectsInjection;

public class Sim {

	private String company;
	private String simtype;
	//setters
	public void setCompany(String company) {
		this.company = company;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	@Override
	public String toString() {
		return "Sim [company=" + company + ", simtype=" + simtype + "]";
	}
	
	
	
}
