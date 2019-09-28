package finalkeyword;
/*
 * we can declare a variable or method or class as final
 * 
 * if we declare a variable as final then we can not change it's value
 * 
 * if we declare a method as final in parent class then 
 * we can not override that method in child class
 * 
 * if we declare a class as final then we can not create child classes
 * to that class but it can have a parent class
 */

public class FinalKeywordDemo {
	
	int i = 10;
	
	final int f = 20;

	
	public static void main(String[] args) {
		FinalKeywordDemo obj = new FinalKeywordDemo();
		System.out.println("i = "+obj.i+"\tf = "+obj.f);
		obj.i = 100;
//		obj.f = 200;
		System.out.println("i = "+obj.i+"\tf = "+obj.f);
	}
}
