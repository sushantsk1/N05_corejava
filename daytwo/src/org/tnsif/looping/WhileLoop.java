package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
        		int num=scan.nextInt();
        		int i=1;
        		while(i<=num) {
        			System.out.print(num+" ");
        			num--;
        		}
	}

}
