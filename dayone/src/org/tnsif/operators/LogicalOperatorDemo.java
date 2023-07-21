package org.tnsif.operators;

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		//		int num2=scan.nextInt();

		//to check whether the person is allowed or not on water slide
		//here have use the and operator

		if(num1>12&&num1<60) {
			System.out.println("allowed");
		}
		else
			System.out.println("Not allowed");

		//here have use the or operator

		if(num1<18 || num1>60) {
			System.out.println("allowed");
		}
		else
			System.out.println("Not alllowed");
	}

}
