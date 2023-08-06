package org.tnsif.polymorphism;

import java.util.Scanner;

class Laptop {
	String generation1;

	void specification(String genratinon1) {
		System.out.println("laptop: " + generation1);
	}
}

class Asus extends Laptop {
	String generation2;

	void specification(String generation2) {
		super.specification(this.generation2);
		System.out.println("laptop: " + generation2);
	}
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		Asus a = new Asus();
		Scanner scan = new Scanner(System.in);
		String generation1 = scan.next();
		String generation2 = scan.next();
		
		a.specification(generation2);

	}

}
