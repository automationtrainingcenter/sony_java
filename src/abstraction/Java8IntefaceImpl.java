package abstraction;

public class Java8IntefaceImpl implements Java8Interface{

	@Override
	public void methodOne() {
		System.out.println("method one of Java8Interface impl");
	}
	
	//overriding default method of interface
	@Override
	public void methodThree() {
		System.out.println("method three overridden in impl class");
	}
	
	// we can not override static method of the Java 8 interface but we
	// can override default method of Java 8 interface
//	@Override
//	public static void methodTwo() {
//		
//	}
	

}
