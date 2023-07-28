//program to demonstrate cascaded if  ...else statement

package org.tnsif.desicionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age1 = scan.nextInt();
		int age2 = scan.nextInt();
		int age3 = scan.nextInt();

		if (age1 > age2 && age1 > age3) {
			System.out.println("Age 1 is greater than other two\n" + age1);
		} else if (age2 > age1 && age2 > age3) {
			System.out.println("Age 2 is greater than other two\n" + age2);
		} else
			System.out.println("Age 3 is greater than other two\n" + age3);
	}

}
