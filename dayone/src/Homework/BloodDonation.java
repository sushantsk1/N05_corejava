package Homework;
import java.util.Scanner;
public class BloodDonation {


		public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			
			System.out.println("Enter Your Age: ");
			int age=scan.nextInt();
			
			System.out.println("Enter Your Weight: ");
			int weight=scan.nextInt();
			
			if(age>=18&weight>=50) {
				System.out.println("you are eligible");
			}
			else
				System.out.println("you are not eligible");
		}

	}

