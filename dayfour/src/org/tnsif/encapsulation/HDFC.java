
//program to demonstrate on encapsulation
/*encapsulation acheives the data hiding using
 * private access specifiers*/
package org.tnsif.encapsulation;

public class HDFC {
	
//private data members
	private long accountno;
	private int cvvno;
	private String accounttype;
	private int pinno;
	public long getAccountno() {
		return accountno;
	}
	
	
	//setters method use to set the value
	//getters method are used to get the value
	
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinnO) {
		this.pinno = pinnO;
	}


	@Override
	public String toString() {
		return "HDFC [accountno=" + accountno + ", cvvno=" + cvvno + ", accounttype=" + accounttype + ", pinno=" + pinno
				+ "]";
	}
}
