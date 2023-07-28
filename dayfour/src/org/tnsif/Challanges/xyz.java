/*ask a user what their birth year encoded as two digit(like "62")
 * and for the current year , also encoded as two digit(like "99")
 * write a program to find the user current age in years*/

package org.tnsif.Challanges;

import java.util.Iterator;
import java.util.Scanner;

public class xyz {
static void agecalculator(int birth, int current) {
	if (current>birth) {
		System.out.println(current-birth);
	}
	else {
		System.out.println((100-birth)+current);
	}
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birth = scan.nextInt();
		int current = scan.nextInt();
		
		
		
		
//long aproach for this program
//		int sum = 0;
//
//		if (birth <= current) {
//			for (int i = birth; i < current; i++) {
//				sum = i;
//			}
//			System.out.println("age is: " + sum);
//		} else if (birth >= current) {
//			for (int i = current; i < birth; i++) {
//				sum = i;
//			}
//			System.out.println("age is: " + sum);
//		}
		
		agecalculator(birth, current);
		
	}
	
	
	
	
	
}
