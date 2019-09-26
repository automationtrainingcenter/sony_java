package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	public static void main(String[] args) {
//		AccessModifiersDemo obj = new AccessModifiersDemo();
		ProtectedDemo obj = new ProtectedDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar); // private accessmodifier can not be accessed outside the class
//		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
		// protected access modifier can be accessed by creating an object
		// of child class or child class objects can access parent class
		// public and protected outside the package 
		// public, protected and default with in the package
	}

}
