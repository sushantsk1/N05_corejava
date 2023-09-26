/*
 * Ask the customers age and for the time on a 24-hour clock (where noon is 12:00 and 4:30PM
 * is 16:30). The show timings are 10:15, 13:30, 18:00, and 22:00. The normal adult ticket
 * is $8.00, however, the adult matinee price is $5.00. Adults are those over 13 years. The
 * normal children's ticket price is $4.00, however, the chidlren's matinee price is $2.00.
 * Write a program that determines the price of a movie ticket.
 * Sample Input:- 16
 * 				  10.15
 * Sample Output:- $8.00 
*/
package org.tnsif.codingchallenges;
import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:- ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter show time:- ");
		String time = sc.nextLine();
		
		
		int price = 0;
		
		
		if(time.equals("10:15") || time.equals("13:30") || time.equals("18:00") || time.equals("22:00")) {
			if(time.equals("13:30")) {
				if(age >= 13) {
					price = 5;
				}
				else {
					price = 2;
				}
			}
			else {
				if(age >= 13) {
					price = 8;
				}
				else {
					price = 4;
				}
			}
			System.out.println("The Price of the movie ticket is:- " + "$" + price);
		}
		else {
			System.out.println("No Show available at this time.");
		}
		
		sc.close();
		
	}
}
