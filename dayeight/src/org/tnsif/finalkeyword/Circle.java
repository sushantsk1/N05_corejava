package org.tnsif.finalkeyword;

public class Circle extends Shape {
	final float area = 34.5f;
	//final method
	//cant override the final method from shape
	
//	final void printShapeType() {
//		System.out.println(area+" sq.cm");
//	}
	void printShapeType(float area) {
		System.out.println(area+" sq.cm");
	}
}
