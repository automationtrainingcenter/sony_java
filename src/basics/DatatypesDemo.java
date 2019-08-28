package basics;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean 1 bit
* 		char which will store single character - Character 2 bytes
*		byte store integer values - Byte 1 byte 
*		short store integer values - Short 2 bytes
*		int store integer values -Integer 4 bytes
*		long store integer values - Long 8 bytes
*		float store floating point number -Float 4 bytes
*		double store floating point number - Double 8 bytes
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* 	Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/

public class DatatypesDemo {
	
	public static void main(String[] args) {
		// boolean variable
		boolean b = true;
		System.out.println("booelan value is "+b);
		
		// character variable
		// Java support unicode characters 
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("size of character type is "+Character.SIZE);
		System.out.println("min value of character is "+Character.MIN_VALUE);
		System.out.println("max value of character is "+Character.MAX_VALUE);
		
		// integer types
		// byte variable
		byte by = 123;
		System.out.println("byte  value is "+by);
		System.out.println("size of byte is "+Byte.SIZE);
		System.out.println("min value of byte is "+Byte.MIN_VALUE);
		System.out.println("max value of byte is "+Byte.MAX_VALUE);
		
		// short variable
		short sh = 1234;
		System.out.println("short value is "+sh);
		System.out.println("size of short is "+Short.SIZE);
		System.out.println("min value of short is "+Short.MIN_VALUE);
		System.out.println("max value of short is "+Short.MAX_VALUE);
		
		// int variable
		int i = 123456;
		System.out.println("int value is "+i);
		System.out.println("size of int is "+Integer.SIZE);
		System.out.println("min value of int is "+Integer.MIN_VALUE);
		System.out.println("max value of int is "+Integer.MAX_VALUE);
		
		//long variable
		long l = 12345678919l;
		System.out.println("long value is "+l);
		System.out.println("size of long is "+Long.SIZE);
		System.out.println("min value of long is "+Long.MIN_VALUE);
		System.out.println("max value of long is "+Long.MAX_VALUE);
		  
		// float varaible
		float f = 3.14f;
		System.out.println("float value is "+f);
		System.out.println("size of float is "+Float.SIZE);
		System.out.println("min value of float is "+Float.MIN_VALUE);
		System.out.println("max value of float is "+Float.MAX_VALUE);
		
		// double variable
		double d = 9.8;
		System.out.println("double value is "+d);
		System.out.println("size of double is "+Double.SIZE);
		System.out.println("min value of double is "+Double.MIN_VALUE);
		System.out.println("max value of double is "+Double.MAX_VALUE);
		
		// int to string
		i = 3456;
		System.out.println(i+10); // 3466
		String i2s = Integer.toString(i);
		System.out.println(i2s+10); // 345610
		
		// float to string
		f = 90.12f;
		System.out.println(f+10);
		String f2s = Float.toString(f);
		System.out.println(f2s+10);
		
		// string to int
		String is = "987";
		System.out.println(is+10);
		int s2i = Integer.parseInt(is);
		System.out.println(s2i+10);
		
		// string to double
		String ds =  "9.87";
		System.out.println(ds+10);
		double s2d = Double.parseDouble(ds);
		System.out.println(s2d+10);
		
		// type casting: converting one primitive type to another primitive type
		// up casting: lower memory type to higher memory type
		// down casting: higher memory type to lower memory type
		// up casting
		short shLow = 1234;
		int iHigh = shLow;
		System.out.println(iHigh);
		
		int iLow = 123;
		float fHigh = iLow;
		System.out.println(fHigh);
		
		// down casting
		// lower_data_type var_name = (lower_data_type) higher_data_type_var_name
		long lHigh = 12345l;
		int il = (int) lHigh;
		System.out.println(il);
		
		double dHigh = 123.456;
		int  ilow = (int) dHigh;
		float flow = (float) dHigh;
		System.out.println(ilow);
		System.out.println(flow);
		
		short shigh = 400;
		byte blow = (byte) shigh;
		System.out.println(blow);
		
		
	}

}
