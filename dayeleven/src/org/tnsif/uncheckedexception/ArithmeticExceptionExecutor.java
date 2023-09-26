// Program to demonstrate Arithmetic Exception.

package org.tnsif.uncheckedexception;
import java.util.Scanner;

public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// Try Block contains exceptional code.
		try {
			System.out.println(x/y);			
		}
		// Catch Block is used to handle an Exception.
		catch(Exception e) {
			System.out.println("Exception Handled " + e);
		}
		
		sc.close();
	
	}

}
