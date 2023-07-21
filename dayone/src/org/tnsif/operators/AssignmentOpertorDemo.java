package org.tnsif.operators;

import java.util.Scanner;

public class AssignmentOpertorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		//addition
		int res1=num1+=num2;
		
		//substraction
		int res2=num1-=num2;
		
		//multiply
		int res3=num1*=num2;
		
		//division
		int res4=num1/=num2;
					
		System.out.println("Result is: "+res1);
		System.out.println("Result is: "+res2);
		System.out.println("Result is: "+res3);
		System.out.println("Result is: "+res4);
		
	}

}
