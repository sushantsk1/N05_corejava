// Program to demonstrate Array Index out of bound exception.

package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {
	
	static void print(int arr[]) {
		try {
			System.out.println(arr[3]);			
		}
		catch(Exception e) {
			System.out.println("Exception Handled:- " + e);
		}
		finally {
			System.out.println("Finally Block is always Executed.");
		}
		System.out.println("Any statement outside try-catch-finally block is always executed.");
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 4, 5};
		print(arr);
	}

}
