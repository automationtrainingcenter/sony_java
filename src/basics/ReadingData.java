package basics;
/*
 * To read data from the console we have to use Scanner class
 * this class provides several methods to read different types of data
 */

import java.util.Scanner;

public class ReadingData {
	public static void main(String[] args) {
		// To read data create a Scanner class object
		Scanner sc = new Scanner(System.in);
		
		// read an integer data
//		System.out.println("max number we can store in an integer is "+Integer.MAX_VALUE);
		System.out.println("enter a number");
		int i = sc.nextInt();
		System.out.println("i value is "+i);
		
		// read a short integer
		System.out.println("enter a short integer value");
		short sh = sc.nextShort();
		System.out.println("short sh value is "+sh);
		
		// read a byte integer
		System.out.println("enter a byte integer value");
		byte by = sc.nextByte();
		System.out.println("byte by value is "+by);
		
		// read a long integer
		System.out.println("enter a long integer value");
		long l = sc.nextLong();
		System.out.println("long l value is "+l);
		
		// read float value
		System.out.println("enter a float value");
		float f = sc.nextFloat();
		System.out.println("float f value is "+f);
		
		// read double value
		System.out.println("enter a double value");
		double d = sc.nextDouble();
		System.out.println("double d value is "+d);
		
		
		// read a boolean value
		System.out.println("ente a boolean value");
		boolean b = sc.nextBoolean();
		System.out.println("boolean b value is "+b);
		
		// read a string value
		System.out.println("enter a string value");
		String s = sc.next();
		System.out.println("string s value is "+s);
		
		// read a character
		// to read a character Scanner class does not have any direct method
		// we have to read a character as string using next() then get the
		// character a index 0 using charAt() of String class
		System.out.println("enter a character value");
		String schar = sc.next();
		char ch = schar.charAt(0);
		System.out.println("character ch value is "+ch);
		
	}

}
