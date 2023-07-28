package org.tnsif.desicionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Pubg Mobile");

		System.out.println("1: Erangle");
		System.out.println("2: Miramar");
		System.out.println("3: Livik");
		System.out.println("4: Nusa");
		System.out.println("5: Kerakin");
		System.out.println("6: Sanhok");

		System.out.println("Enter your choice : ");
		int map = scan.nextInt();
		switch (map) {
		case 1:
			System.out.println("You are playing Erangle");
			break;
		case 2:
			System.out.println("You are playing Miramar");
			break;

		case 3:
			System.out.println("You are playing Livik");
			break;

		case 4:
			System.out.println("You are playing Nusa");
			break;

		case 5:
			System.out.println("You are playing Kerakin");
			break;

		case 6:
			System.out.println("You are playing Sanhok");
			break;
		default:
			System.out.println("invalid input");
			break;

		}
	}

}
