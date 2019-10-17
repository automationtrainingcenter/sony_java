package collections;

import java.util.Set;
import java.util.TreeSet;

/*
 * Set is a collection which is used to store multiple values of similar data type
 * Set does not store duplicate values and Set is not index based
 * Set is an interface which is implemented by 3 classes
 * 1. HashSet: it will not maintain any order to store the data
 * 2. LinkedHashSet: it will maintains insertion order to store the data
 * 3. TreeSet: it will maintain alphabetical order for char and string data 
 * and ascending order for numeric order
 */
public class SetDemo {

	public static void main(String[] args) {
		// creating a set
		Set<String> courses = new TreeSet<>();

		// find the number of items in your collection
		System.out.println(courses.size());

		// verify your collection is empty or not
		System.out.println(courses.isEmpty());

		// add the data
		courses.add("c");
		courses.add("cpp");
		courses.add("java");
		courses.add("Python");
		courses.add("selenium");
		courses.add("cpp");
		courses.add("testing");
		courses.add("Django");

		// print the data of the collection on the console
		System.out.println(courses);

		// retrieve the data from the set
		for (String course : courses) {
			System.out.println(course.toUpperCase());
		}

		// delete the data from the set
		courses.remove("cpp");
		System.out.println(courses);

		// contains to search any data in the set
		System.out.println(courses.contains("selenium"));

		// remove all the data from the set
		courses.clear();
		System.out.println(courses.size());

	}

}
