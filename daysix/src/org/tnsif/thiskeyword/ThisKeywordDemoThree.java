package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {

	void print() {
		System.out.println("hey Handsome !");
	}
	void display() {
		
		/*when u call any parameterized method inside
		 * non parameterized method then ,we get an error
		 * to overcome that we have to use this keyword as an argument
		 * int method call*/
		this.print();
	}
	public static void main(String[] args) {
		ThisKeywordDemoThree t=new ThisKeywordDemoThree();
		t.display();
	}

}
