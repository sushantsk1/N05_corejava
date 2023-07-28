package org.tnsif.desicionmaking;
import java.util.Scanner;
public class NestedIfElseexecutor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter your age");
				int age=scan.nextInt()	;
				System.out.println("enter your weight");
		int weight=scan.nextInt();
		
		if(age>=12) {
			if(weight>=40) {
				System.out.println("you are eligible");
				if(weight>=110) {
					System.out.println("need an extra bunch of ropes");
				}
			}else if(weight<40) {
				System.out.println("you are not eligible");
			}
		}else 
			System.out.println("you are not eligible");
		
	
	}

}
