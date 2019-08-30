package basics;

/**
 * String is a collection of characters
 * Strings are immutable in java that means we can't modify or change string data once 
 * stored in a memory location
 * Strings will store in separate memory location known as String constant pool
 * To create mutable strings we have to use StringBuilder or StringBuffer classes
 * 
 * String values must be stored using ""
 */
public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "Selenium";
		String s2 = "python";
		String s3 = "manual";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		s2 = "Java";
		s3 = "Selenium";
		String  s4 = "Selenium";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
