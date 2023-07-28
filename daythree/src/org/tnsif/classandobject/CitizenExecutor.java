//this is a driver class
//profram to demonstrate on default and parameterized constructor

package org.tnsif.classandobject;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c=new Citizen();
		
		Citizen c1=new Citizen("adult",983662238311L,"male","nashik" ); 
		System.out.println(c1);
}
}