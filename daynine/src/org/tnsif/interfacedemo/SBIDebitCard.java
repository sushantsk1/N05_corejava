package org.tnsif.interfacedemo;

// Implementable Class.
public class SBIDebitCard implements DebitCard {

	@Override
	public void displayCardDetails() {
		System.out.println("Card no: " + cardno);
	}
	
}
