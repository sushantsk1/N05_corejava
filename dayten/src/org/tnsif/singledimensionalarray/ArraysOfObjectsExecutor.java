// Driver Class.
// Program to Demonstrate on Array of Objects.

package org.tnsif.singledimensionalarray;

public class ArraysOfObjectsExecutor {

	public static void main(String[] args) {
		Employee arr[] = new Employee[2];
		arr[0] = new Employee(101, "Sahil Gujarathi", 45000.8);
		arr[1] = new Employee(102, "Vishal Pawar", 45000.8);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getID() + " " + arr[i].getName() + " " + arr[i].getSalary());
		}
		
	}
}
