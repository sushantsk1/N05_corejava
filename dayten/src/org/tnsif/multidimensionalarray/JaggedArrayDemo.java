// Program to Demonstrate on Jagged Array.
package org.tnsif.multidimensionalarray;
import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * In jagged Array outside array size is fixed, but inside array size is different
		 * for different outside array index.
		*/
		
		// Jagged Array Declaration.
		int arr[][] = new int[2][];
		// For outside array index 0, storing 3 elements.
		arr[0] = new int[3];
		
		// For outside array index 2, storing 2 elements.
		arr[1] = new int[2];
		
		// Initialization of Elements in an Array.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// Printing Jagged Array.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		
		sc.close();
	}
}
