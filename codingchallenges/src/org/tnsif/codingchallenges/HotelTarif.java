/*
 * Write a Program to calculate the hotel tarif . the room rent is 20% high during peak 
 * seasons (April to june is the peak season and nov to dec also peak season) , 
 * hint:- use the switch cases. 
 * Input:- month = 3;
 * rent = 1500;
 * day = 2 days.
 * Calculate hotel budget. 
*/
package org.tnsif.codingchallenges;
import java.util.Scanner;


public class HotelTarif {
	
	public static void tarif(int month, int rent, int day) {
		float budget;
		if(month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
			float percent_add = (20*rent)/100;
			float tempRent = rent + percent_add;
			budget = tempRent * day;
		}
		else {
			budget = rent * day;
		}
		switch(month) {
		case 1:
			System.out.println("The Budget is:- " + budget);
			break;
		case 2:
			System.out.println("The Budget is:- " + budget);
			break;
		case 3:
			System.out.println("The Budget is:- " + budget);
			break;
		case 4:
			System.out.println("The Budget is:- " + budget);
			break;
		case 5:
			System.out.println("The Budget is:- " + budget);
			break;
		case 6:
			System.out.println("The Budget is:- " + budget);
			break;
		case 7:
			System.out.println("The Budget is:- " + budget);
			break;
		case 8:
			System.out.println("The Budget is:- " + budget);
			break;
		case 9:
			System.out.println("The Budget is:- " + budget);
			break;
		case 10:
			System.out.println("The Budget is:- " + budget);
			break;
		case 11:
			System.out.println("The Budget is:- " + budget);
			break;
		case 12:
			System.out.println("The Budget is:- " + budget);
			break;
		default:
			System.out.println("Invalid Month No.");
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month:- ");
		int month = sc.nextInt();
		
		System.out.println("Enter Rent:- ");
		int rent = sc.nextInt();
		
		System.out.println("Enter Day:- ");
		int day = sc.nextInt();
		
		tarif(month, rent, day);
		
		sc.close();

	}

}
