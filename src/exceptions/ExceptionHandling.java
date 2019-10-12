package exceptions;
/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void openFileToReadData(String filepath) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(".\\config.txt");
	}

	public static void main(String[] args) {
		int[] marks = { 18, 19, 17, 19, 16, 15 };
		System.out.println(marks[0]);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("thread was interruped");
			System.out.println(e.getMessage());
		}
		System.out.println(marks[5]);
		try {
			openFileToReadData(".\\config.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist in the given path");
			System.out.println(e.getMessage());
		}
		System.out.println(marks[2]);
		try {
			System.out.println(marks[3] / 10);
		} catch (ArithmeticException e) {
			System.out.println("denominator must not be 0");
		}
		System.out.println(marks[4]);
	}

}
