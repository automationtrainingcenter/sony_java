package constructors_and_methods;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */
public class ConstructorDemo {

	// instance variables
	int id;
	String name;
	String course;
	double fee;

	// default constructor
	public ConstructorDemo() {
		this.id = 10;
		this.name = "satish";
		this.course = "java";
		this.fee = 12000.00;
	}

	// parameterized constructor
	public ConstructorDemo(int id, String name, String course, double fee) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}

	// constructor overloading
	public ConstructorDemo(int id, String name, String course) {
		this(id, name, course, 0.0);
	}

	public void display() {
		System.out.println(
				"id = " + this.id + "\nname = " + this.name + "\ncourse = " + this.course + "\nfee = " + this.fee);
	}

	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();
		obj1.display();
		ConstructorDemo obj2 = new ConstructorDemo(100, "ravi", "python", 7000.00);
		obj2.display();
		ConstructorDemo obj3 = new ConstructorDemo(101, "sruthi", "selenium");
		obj3.display();
	}

}
