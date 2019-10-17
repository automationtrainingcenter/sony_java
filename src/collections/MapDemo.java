package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is a collection which is used to store multiple values of similar data type
 * map will store the data in key and value pairs
 * Map is an interface which is implemented by 3 classes
 * 1. HashMap: it will not maintain any order
 * 2. LinkedHashMap: it will maintain insertion order
 * 3. TreeMap: it will maintain alphabetical order for char and string data 
 * and ascending order for numeric order of keys
 * 
 * if we repeated same key then previous value will be updated with new value
 * to that key, i.e. we can not duplicate keys
 * 
 */

public class MapDemo {
	public static void main(String[] args) {
		// create a map
		Map<String, Integer> courses = new TreeMap<>();
		
		// find the number of items in your collection
		System.out.println(courses.size());

		// verify your collection is empty or not
		System.out.println(courses.isEmpty());
		
		// add the data to the map
		courses.put("c", 30);
		courses.put("cpp", 35);
		courses.put("c", 40);
		courses.put("selenium", 45);
		courses.put("java", 40);
		courses.put("testing", 60);
		courses.put("python", 55);
		
		
		// print the map on the console
		System.out.println(courses);
		
		// retrieve data from the map
		System.out.println(courses.get("selenium"));
		
		// retrieve all the data from the map
		// to retrieve all the from map first retrieve all keys in map
		Set<String> keys = courses.keySet();
		for(String key : keys) {
			System.out.println(key +" ------- "+courses.get(key));
		}
		
		// update the data in the map
		courses.put("selenium", 80);
		System.out.println(courses);
		
		// delete the data from the map
		courses.remove("cpp");
		System.out.println(courses);
		
		courses.remove("c", 40);
		System.out.println(courses);
		
		// search for data
		System.out.println(courses.containsKey("java"));
		System.out.println(courses.containsValue(42));
		
		// remove all the data from the map
		courses.clear();
		
		System.out.println(courses.size());
	}
}
