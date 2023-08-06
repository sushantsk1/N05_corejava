package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
int x;
//default constructor
 ThisKeywordDemoFour() {
	this(34);
	System.out.println("this is default constructor");
}
ThisKeywordDemoFour(int x){
	this.x=x;
	System.out.println("this is parametrized constructor"+x);
}
	public static void main(String[] args) {
ThisKeywordDemoFour t=new ThisKeywordDemoFour();
	}

}
