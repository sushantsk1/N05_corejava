package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	
//	if(num%2==0) {
//		System.out.println("even");
//	}
//	else
//		
//		System.out.println("odd");
	
	
	
//	or u can use
	
	
	String res=(num%2==0)?"even":"odd";
	System.out.print("Result is : "+res);
	scan.close();
	}
}
