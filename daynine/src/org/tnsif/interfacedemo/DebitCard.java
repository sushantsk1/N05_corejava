package org.tnsif.interfacedemo;

public interface DebitCard {
	/* 
	 * By Deafult all the variables inside an interface is public static final and if it is
	 * final then we must have to initialize value for that variable.
	*/
	long cardno = 578969680797L;
	// We can't use concrete method inside an interface.
	// By Default, method inside an interface is an abstract.
	void displayCardDetails();
	
	/*
	 * Default method and static method is the new features of Java 8 which can be used 
	 * inside an interface.
	*/
	default void display() {
		System.out.println("Default Method.");
	}
	
	// Static Method
	static void print() {
		System.out.println("Static Method");
	}

}




