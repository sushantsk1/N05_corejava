package org.tnsif.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		//noe we use operaotrs
		System.out.println(num1+num2+"\n");
		System.out.println(num1-num2+"\n");
		System.out.println(num1/num2+"\n");
		System.out.println(num1*num2+"\n");
		scan.close();
		}
}
