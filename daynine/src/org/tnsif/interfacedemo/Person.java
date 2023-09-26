package org.tnsif.interfacedemo;

// Implementable Class or Child Class.
// Program to Demonstrate on Multiple Inheritance.

public class Person implements ColdDrink, Alcohol {

	@Override
	public void showDrinkName() {
		System.out.println(brand + " " + alcoholName + " " + name);
	}
}
