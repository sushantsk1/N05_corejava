package org.tnsif.looping;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		do {
			System.out.println("value of n is: "+n);
			n++;
		}while(n<14);
	}

}
