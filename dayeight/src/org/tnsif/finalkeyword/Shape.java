package org.tnsif.finalkeyword;
//program to demonstrate final keyword

//we cant inherit final class
//public final class shape
public class Shape {
	final String shapename = "circle";

	final void printShapeType() {
		System.out.println(shapename);
	}
}
