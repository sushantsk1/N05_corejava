package org.tnsif.looping.homework;

import java.util.Scanner;

public class NumberDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		
		
	}

}
