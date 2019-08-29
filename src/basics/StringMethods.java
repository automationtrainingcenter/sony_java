package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		String s3 = " webdriver";
		String s4 = "SUNSHINE";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println(s1.length()); // 8
		System.out.println(s2.length()); // 0

		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println(s1.isEmpty()); // false
		System.out.println(s2.isEmpty()); // true
		
		/* concat(): combines two given strings */
		System.out.println(s1.concat(s3)); // selenium webdriver
		System.out.println(s1);// selenium
		System.out.println(s3); //  webdriver

		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("Selenium")); // false
		System.out.println(s1.equals(s4)); // false
		System.out.println(s1.equals("selenium")); // true
		
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("Selenium")); // true
		System.out.println(s1.equalsIgnoreCase(s4)); // false
		System.out.println(s1.equalsIgnoreCase("selenium")); // true
		

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s5.contains(s1)); // true
		System.out.println(s5.contains("java")); // false

		/* toLowerCase(): converts given string to lower case */
//		s4 = s4.toLowerCase();
		System.out.println(s4.toLowerCase());
		System.out.println(s4);

		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase());
		
		/* charAt(): returns a character at a given index number */
		char ch = s1.charAt(5);
		
		/* indexOf(): returns index value of first occurrence of a given character */
		int i = s1.indexOf('e');
		System.out.println(i);
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s1.startsWith("sel"));// true
		System.out.println(s4.startsWith("sun")); // false
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s1.endsWith("nium")); // true
		System.out.println(s4.endsWith("shine")); // false
		
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', '@'));
		System.out.println(s5.replace("Java", "Python"));

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(2, 5));

		/* toCharArray() return an array of characters inside the given string */
		char[] chars = s1.toCharArray();
		System.out.println(chars.length);
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		System.out.println(words.length);
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println("before trim s6 is"+s6);
		s6 = s6.trim();
		System.out.println("after trim s6 is "+s6);
	}
}
