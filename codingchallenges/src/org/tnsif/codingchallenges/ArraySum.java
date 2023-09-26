/*
 * Today's coding challenge:-
 * Shahid is a computer science student and his teacher gave him a simple question to solve
 * within time but he is little busy in his life, so he asked you to solve this problem.
 * Problem statement : You have been given an array of positive integers A1,A2,...,An with
 * length N and you have to print an array of same legnth(N) where the values in the new
 * array are the sum of every number in the array, except the number at that index.
 * Input:
 * The first line of input contains a single integer T denoting the number of test cases.
 * Each test cases contain two lines.First line contains N, the length of the array and 
 * second line contains N space separated positive integers.
 * Output:
 * For each test case, output a single array of same length.
 * Constraints:
 * 1 ≤ T ≤ 100
 * 1 ≤ N ≤105
 * 0 <= A[i] <= 109
 * Example:
 * Input
 * 2
 * 4
 * 1 2 3 4
 * 3
 * 4 5 6
 * Output
 * 9 8 7 6
 * 11 10 9
 * Explanation
 * Test case 1: For the first index, the result will be 2+3+4= 9, similarly for the second,
 *  third and fourth index the corresponding results will be 8, 7 and 6 respectively. 
*/

package org.tnsif.codingchallenges;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int n = arr.length;
		
		int[] ans = new int[n];
		for(int i=0; i<n; i++)  {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					ans[i] = ans[i] + arr[j];					
				}
			}
		}
		
		// Printing the New Array
		for(int i=0; i<n; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
}
