// Driver Class.
// Program to demonstrate on User-Defined Exception.

package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email ID and Password.");
		String email = sc.nextLine();
		String password = sc.nextLine();
		
		try {
			if(email.equals("Gujarathi") && password.equals("Pass@123")) {
				System.out.println("Credentials Matched.");
			}
			else {
				throw new LoginCredentials("Invalid Credentials.");
			}
		}
		catch(LoginCredentials e) {
			System.out.println(e);
		}
		
		sc.close();
	}
}
