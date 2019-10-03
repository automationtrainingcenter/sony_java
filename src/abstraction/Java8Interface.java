package abstraction;

public interface Java8Interface {
	
	public abstract void methodOne();
	
	// java 8 allows concrete methods i.e. method with definition
	// and these methods are either static methods or default methods
	// static method
	public static void methodTwo() {
		System.out.println("static method of interface");
	}

	
	// default method
	/*
	 * default is new keyword introduced in Java8 which is
	 * used to create concrete methods in interface
	 */
	public default void methodThree() {
		System.out.println("default method of interface");
	}
}
