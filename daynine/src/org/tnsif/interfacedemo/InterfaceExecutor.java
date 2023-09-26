package org.tnsif.interfacedemo;

// Driver Class.
// Program to Demonstrate on an interface.

public class InterfaceExecutor {

	public static void main(String[] args) {
		// We cannot instantiate an interface.
		// DebitCard d = new DebitCard();
		
		SBIDebitCard s = new SBIDebitCard();
		s.displayCardDetails();
		
		// We can call default method of an interface using the object of implementable class.
		s.display();
		
		/*
		 * print() is a static method inside an interface, to call print() method, we have
		 * to use interfacename.method.
		 * name(); 
		*/
		DebitCard.print();
		
		CheesePopcorn c = new CheesePopcorn();
		c.displayReceipe();
		
		Person p = new Person();
		p.showDrinkName();
		
	}
}

