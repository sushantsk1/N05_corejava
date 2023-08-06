package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
int x,y;

void setData(int a,int b) {
	//we can change the variable name if we want
	this.x=a;
	this.y=b;
}
void display() {
	System.out.println("x: "+x+" y:"+y);
}
	public static void main(String[] args) {
		ThisKeywordDemoOne th=new ThisKeywordDemoOne();
		th.setData(2, 4);
		th.display();

	}

}