// Program to Demonstrate 2-D Array.
package org.tnsif.multidimensionalarray;
import java.util.Scanner;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][2];
		
		// Outside Array.
		for(int i=0; i<3; i++) {
			// Inside Array.
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// For Printing 2-D Array.
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
			
	}
}



