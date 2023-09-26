// Program to demonstrate throw and throws keyword.
package org.tnsif.uncheckedexception;
import java.io.IOException;

public class ThrowExecutor {
	
	// throws keyword is used to declare an exception.
	static void isEligible(int age, int weight) throws IOException {
		if(age > 18 && weight > 50) {
			System.out.println("Eligible to donate the blood.");
		}
		else {
			// throw keyword is used to throw an exception explicitly.
			throw new IOException("Age and Weight Criteria is not fulfilled.");
		}
	}

	public static void main(String[] args){
		try {
			isEligible(12,54);
		} 
		catch (IOException e) {
			System.out.println(e);		
			}
		
	}

}
