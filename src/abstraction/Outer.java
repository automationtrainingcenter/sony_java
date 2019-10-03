package abstraction;

public interface Outer {
	public void methodOne();
	
	// method which return Inner interface object reference
	Inner method();
	
	// inner interface
	interface Inner{
		public void methodTwo();
	}
}
