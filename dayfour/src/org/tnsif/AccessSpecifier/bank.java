package org.tnsif.AccessSpecifier;

public class bank {
	
//different access specifiers	
public String  bankname; 
private int pinno;
long accountno=654044426890L;

//public method
public void displypublic() {
	System.out.println("bank name is: "+bankname);
}

//private method
private void displayprivate() {
	System.out.println("pin no: "+pinno);
}

//default method
void displayfault() {
	System.out.println("account no is: "+accountno);
}

}

