package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\UUSHA INFOTECH NASIK\\hello.txt");
			System.out.println("File has Found.");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not exist: " + e);
		}
	}
}
