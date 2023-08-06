package org.tnsif.finalkeyword;
//program to demonstrate on final keyword wit  variable
public class FinalVariable {
	
	//the blank final field NUM may not have been initialized
	//final int NUM;
	final float SALARY=78000.67f;
	
	public void print() {
		/*we can't change value of final variable*/
		//salary=89000.56f;
		System.out.println("salary : "+SALARY);
	}
	
	

}
