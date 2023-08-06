//program to demonstrate on  compile time polymorphism

package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood{
	String str1,str2,str3;
	void display(String str1,String str2) {
		System.out.println(str1+" loves "+str2);
	}
	void display(String str1,String str2,String str3) {
		System.out.println(str1+" loves both "+str2+" "+str3);
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		String str3=scan.next();
		Bollywood b=new Bollywood();
		b.display(str1, str2);
		b.display(str1, str2, str3);

	}

}
