package constructors_and_methods;
/*
 * method is a block of statements which are combined together to achieve a 
 * specific task.
 * 
 * every method have 3 parts
 * Method declaration or method head
 * Method definition or method body
 * Method call
 * 
 * until we call a method, the statements in the method definition will not execute
 * 
 * syntax to declare a method:
 * access_modifier |static| return_type method_name(arg1, arg2, arg3 ... argN){
 * statements;
 * statements;
 * statements;
 * optional return statement;
 * }
 * 
 * syntax to call a method:
 * return_data_type var_name = method_name(para1, para2, para3 ... paraN);
 * 
 * eg:
 * public void methodOne(int a, int b){
 * 	statements;
 * }
 * 
 * In a method static keyword is used to create static methods
 * In a method arguments and return type both are optional
 * In general arguments are input we are passing to the method and return type is 
 * output of the method. If a method does not have any output then the return type 
 * of the method is void
 * 
 * we have 4 types of methods based on input and output
 * method without input and without output
 * method with input and without output
 * method without input and with output
 * method with input and with output
 */

public class MethodsDemo {
	
	// method without input and without output
	public void methodOne() {
		System.out.println("method without input and without output");
	}
	
	// method with input and without output
	public void methodTwo(int a) {
		System.out.println("method with input and without output");
		System.out.println("input is "+a);
	}
	
	// method without input and with output
	public int methodThree() {
		System.out.println("method without input and with output");
		System.out.println("this method returns an integer output");
		return 100;
	}
	
	// method with input and with output
	public int methodFour(int a, int b) {
		System.out.println("method with input and with output");
		System.out.println("input 1 is "+a+"input 2 is "+b);
		System.out.println("this method returns sum of input1 and input2 ");
		return a + b;
	}

	
	public static void main(String[] args) {
		// create an object of MethodsDemo class
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo(10);
		int output1 = obj.methodThree();
		System.out.println("output is "+output1);
		int output2 = obj.methodFour(10,  20);
		System.out.println("output2 is "+output2);
	}
	
}

