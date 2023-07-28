//driver class
package org.tnsif.classandobject;

public class SandwichExecutor {

	public static void main(String[] args) {
		
		//object creation
		Sandwich s=new Sandwich();
         s.breadtype="brown bread";
         s.noofslices=4;
         //method call
         s.display();
	}

}
