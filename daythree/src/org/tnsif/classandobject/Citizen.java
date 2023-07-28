//program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class Citizen {
	String citizentype;
	long adhaar;
	String gender;
    String city;
	public Citizen() {
	
		System.out.println("demonstration on default constructor");
	}
	public Citizen(String citizentype, long adhaar, String gender, String city) {
		this.citizentype = citizentype;
		this.adhaar = adhaar;
		this.gender = gender;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Citizen [citizentype=" + citizentype + ", adhaar=" + adhaar + ", gender=" + gender + ", city=" + city
				+ "]";
	}
	  
}
