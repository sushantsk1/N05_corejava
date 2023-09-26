package org.tnsif.abstractkeyword;
// Driver Class.
// Program to demonstrate on abstract keyword.
public class AbstractClassExecutor {

	public static void main(String[] args) {
		
		// We can't create an object for an abstract class .
		// Operator o = new Operator();
		
		Addition a = new Addition();
		a.add(10,20);
		a.operation();
				
	}
}
