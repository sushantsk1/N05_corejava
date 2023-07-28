package org.tnsif.AccessSpecifierDemo;

import java.awt.DisplayMode;
import org.tnsif.AccessSpecifier.bank;

public class bankexecutor {

	public static void main(String[] args) {
		bank b = new bank();
		b.bankname = "SBI";
		b.displypublic();

		/*
		 * pinnno and displayprivate method are private , so we cant access into another
		 * class and another package, only we can access private data members inside the
		 * same class
		 */

		// b.displayprivate();\
		// b.pinno;

		
		/*account no and siplay default are default thats why we cant use it in another class
		 * only we can access within same package*/
		
		// b.accounno;
		// b.diplaydefault();

	}
}
