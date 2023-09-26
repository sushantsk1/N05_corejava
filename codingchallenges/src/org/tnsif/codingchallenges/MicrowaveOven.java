/*
 * A microwave oven manufacturer recommends that when heating 2 items , add 50% to the 
 * heating time and when heating 3 items double the heating time. heating more than 3
 * items is not recommended. Write a program to find out the recommended heating time.
 * Input:- Item = 2
 * 		   Heating time = 5.0
*/

package org.tnsif.codingchallenges;
import java.util.Scanner;

public class MicrowaveOven {
	
	public static void heatTime(int item, float heatingTime) {
		
		if(item == 2) {
			heatingTime = (heatingTime/2) + heatingTime;			
		}
		else if(item == 3) {
			heatingTime = heatingTime * 2;			
		}
				
		switch(item) {
		case 0:
			System.out.println("Please Enter Valid Item.");
			break;
			
		case 1:
			System.out.println("Heating Time is:- " + heatingTime);
			break;
		
		case 2:
			System.out.println("Heating Time is:- " + heatingTime);
			break;
			
		case 3:
			System.out.println("Heating Time is:- " + heatingTime);
			break;
		
		default:
			System.out.println("Items above 3 are not Recommended.");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Items:- ");
		int item = sc.nextInt();
		
		System.out.println("Enter Heating Time:- ");
		float heatingTime = sc.nextFloat();
		
		heatTime(item, heatingTime);
		
		sc.close();

	}

}
