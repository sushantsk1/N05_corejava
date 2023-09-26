package org.tnsif.interfacedemo;

// Implementable Class for a Functional Interface.

public class CheesePopcorn implements PopCorn{

	@Override
	public void displayReceipe() {
		System.out.println("Take Popcorn Packets"
				+ " from shop and cook it in high"
				+ " fire inside a cooker.");
	}

}
