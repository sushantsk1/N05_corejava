// Program to Demonstrate on Array using compile-time input value.
package org.tnsif.singledimensionalarray;

public class ArrayExample {

	public static void main(String[] args) {
		// Declaration and Initialization of an Array at Compile-time.
		
		int arr[] = {44,56,2,32,28};
		System.out.println(arr[2]);
		
		// To print all the values of an array.
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
}
