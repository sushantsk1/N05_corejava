// Program to demonstrate 

package org.tnsif.customexception;

public class LoginCredentials extends Exception {
	
	// Private Data Member.
	private String str;

	// Parameterized Constructor.
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	// Getters and Setters.
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}	
}
