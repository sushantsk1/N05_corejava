package org.tnsif.instanceDemo;
//program to demonstrate on instance of operator
class Flower{
	String name="Rose";
}
class Lily extends Flower{
	String color="purple";
}
class Rose extends Flower{
	String color="Red";
}
public class InstanceExecutor {

	public static void main(String[] args) {
		Rose r=new Rose();
		Lily l=new Lily();
		//		System.out.println(r instanceof Flower);
		//or we can use if -else too to get false instead of eeror 
		if (l instanceof Lily) {
			System.out.println("true");
		}
		else if (r instanceof Rose) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
