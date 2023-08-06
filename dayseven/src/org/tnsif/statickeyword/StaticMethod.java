package org.tnsif.statickeyword;
public class StaticMethod {

	int x=2;
	static String collegename="MET";
	/* if any method outside the main function and if you want to
	 * access that method inside the main function, we have to make
	 * that method as a static*/
	//static method
	public static void print()
	{
		System.out.println(collegename);
		/*2. we can't use non-static variable inside any static method*/
		//System.out.println(x);
	}
	public static void main(String[] args) {
		print();

	}

}
