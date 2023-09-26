package org.tnsif.abstractkeyword;

public abstract class Operator {
	
	// Abstract Method.
	abstract void operation();
	/* 
	 * If abstract class contains more than one method, then provide the implementation to
	 * all the abstract method of that class inside child class. 
	*/
	
	abstract void multiplication();
	
	// Concrete Method.
	void add(int a, int b) {
		System.out.println(a+b);
	}
}
