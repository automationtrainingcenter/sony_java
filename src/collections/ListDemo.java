package collections;

import java.util.LinkedList;
import java.util.List;

/*
 * List is collection which is used multiple values of similar data type
 * List is an Interface which belongs to java.util package
 * List interface is implemented by ArrayList and LinkedList classes
 * List is index based and index number starts from 0
 * 
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		// creating a list
		List<String> courses = new LinkedList<>();

		// find the number of items in your collection
		System.out.println(courses.size());

		// add data to the list
		courses.add("c");
		courses.add("cpp");
		courses.add("java");
		courses.add("python");
		courses.add("selenium");
		courses.add("cpp");
		courses.add("testing");
		System.out.println(courses.size());

		// print the data inside the list
		System.out.println(courses);

		// retrieve the data from the list using index number
//		System.out.println(courses.get(1));

		// using normal for loop
//		for(int i = 0; i<courses.size(); i++) {
//			System.out.println(courses.get(i).toUpperCase());
//		}

		// using for each loop
		for (String crs : courses) {
			System.out.println(crs.toUpperCase());
		}

		// insert the data at a given index number
		courses.add(3, "SAP");
		System.out.println(courses);

		// update the data at a given index number
		courses.set(4, "php");

		System.out.println(courses);

		// delete the data at a given index number
		courses.remove(3);
		System.out.println(courses);

		// remove first occurrence of the given item
		courses.remove("cpp");
		System.out.println(courses);

		// search for some data
		System.out.println(courses.contains("SAP"));

		// remove all the data of the collection
		courses.clear();

		System.out.println(courses.size());

		// verify your collection is empty or not
		System.out.println(courses.isEmpty());
	}

}
