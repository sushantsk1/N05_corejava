package org.tnsif.Challanges;

import java.util.Iterator;
//*********************************************************************************************************************************************************
/* 
 * Question:
 * there are n people standing in a circle waiting to be executed .
 * the counting out begins at some point in the circle and process around circle in fix direction.
 * in each step a certain number of people are skipped ,
 * and the next person is executed. 
 * the elimination proceed around the circle (which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains ,who is given freedom ?
 * given the total number person n and the number k which indicate that k-one person are skipped 
 * and the k'th person is killed in a circle
 * the task is to choose the person in the initial circle that survive*/
//***********************************************************************************************************************************************************
//answer: 
import java.util.Scanner;


public class CircleChallange {
static int survive(int n,int k) {
	if (n==1) {
		return 1;
		
	}else {
		return (survive(n-1, k)+k-1)%n+1;
	}
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
	System.out.println(survive(n,k));	
	
	}
}