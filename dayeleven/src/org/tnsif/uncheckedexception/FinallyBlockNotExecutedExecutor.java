package org.tnsif.uncheckedexception;
import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// Try Block contains exceptional code.
		try {
			System.out.println(x/y);	
			// When we use System.exit(0), then finally block does not get executed.
			System.exit(0);
		}
		// Catch Block is used to handle an Exception.
		
		catch(Exception e) {
			System.out.println("Exception Handled " + e);
			// When we use System.exit(0), then finally block does not get executed.
			System.exit(0);
		}
		finally {
			// When Finally Block contains an exception then, finally block does not execute.
			// System.out.println(4/0);
			System.out.println("Finally Block is always executed.");
		}
		
		sc.close();
	}

}
