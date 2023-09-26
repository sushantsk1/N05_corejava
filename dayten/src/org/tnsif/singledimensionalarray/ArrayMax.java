// Program to Demonstrate run-time array and to find out Largest element in an array.
package org.tnsif.singledimensionalarray;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements in an Array.");
		int n = sc.nextInt(); // Taking Size of an Array.
		
		// Array Declaration.
		int arr[] = new int[n]; 
		// Taking Input for an Array.
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();		
		
		// Finding Largest Element of an Array.
		int largest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("The Largest Element in the array is :- " + largest);
		
		// Arrays is a class and sort is the built in the method.
		Arrays.sort(arr);
		System.out.println("Sorted Array.");
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
}






