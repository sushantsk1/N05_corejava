
//program to demonstrate on encapsulation
/*encapsulation acheives the data hiding using
 * private access specifiers*/
package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setAccountno(234567889012L);
		h.setAccounttype("current account");
		h.setCvvno(564);
		h.setPinno(7875);

//		System.out.println(h.getAccountno());
//		System.out.println(h.getAccounttype());
//		System.out.println(h.getCvvno());
//		System.out.println(h.getPinno());

		System.out.println(h);
	}

}
