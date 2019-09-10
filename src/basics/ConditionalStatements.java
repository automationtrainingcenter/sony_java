package basics;

import java.util.Scanner;

/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatements {
	public static void main(String[] args) {
		int num1 = -1234;
		// simple if statement to verify given number is positive
		if (num1 >= 0) {
			System.out.println("given number is poisitive");
		}

		// if else statement verify given number is even or odd
		if (num1 % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}

		// facebook scenario
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		String fuser = sc.next();
		System.out.println("enter password");
		String fpass = sc.next();
		if (fuser.equalsIgnoreCase("sunshine") && fpass.equals("Java")) {
			System.out.println("Welcome user");
		} else {
			System.out.println("invalid credentials");
		}

		// gmail scenario
		System.out.println("enter gmail username");
		String guser = sc.next();
		if (guser.equals("sunshine")) {
			System.out.println("enter password");
			String gpass = sc.next();
			if (gpass.equals("Java")) {
				System.out.println("welcome user");
			} else {
				System.out.println("invalid password");
			}
		} else {
			System.out.println("invalid username");
		}

		// else if ladder to verify biggest number in given two numbers
		int n1 = 100;
		int n2 = 100;
		if (n1 > n2) {
			System.out.println("n1 is bigger");
		} else if (n2 > n1) {
			System.out.println("n2 is bigger");
		} else {
			System.out.println("both are equal");
		}

		if (n1 != n2) {
			if (n1 > n2) {
				System.out.println("n1 is bigger");
			} else {
				System.out.println("n2 is bigger");
			}
		} else {
			System.out.println("both are equal");
		}
		
		// switch case
		System.out.println("select your level 1 or 2 or 3");
		int level = sc.nextInt();
		switch(level) {
		case 1:
			System.out.println("instructions");
			System.out.println("tips");
			System.out.println("Game launched in easy mode");
			break;
		case 2:
			System.out.println("tips");
			System.out.println("Game launched in moderate mode");
			break;
		case 3:
			System.out.println("Game launched in advanced mode");
			break;
		default:
			System.out.println("invalid level");
		}
		
	}

}
