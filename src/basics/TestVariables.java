package basics;

public class TestVariables {
	public static void main(String[] args) {
		// accessing instance variable
		VariablesDemo obj = new VariablesDemo();
		System.out.println(obj.i);
		
		// accessing static variable
		System.out.println(VariablesDemo.s);
	}

}
