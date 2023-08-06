package org.tnsif.thiskeyword;

public class ThisKeywordDemoTwo {
	int x, y;

	public ThisKeywordDemoTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println("x: " + x + " y:" + y);
	}

	public static void main(String[] args) {
ThisKeywordDemoTwo t=new ThisKeywordDemoTwo(3, 5);
t.display();
	}

}
