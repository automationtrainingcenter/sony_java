package polymorphism;

public class CompileTimePolyDemo {
	public void add(int a, String b) {
		int ib = Integer.parseInt(b);
		System.out.println(a + ib);
	}

	// change in type of arguments
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// change in number of arguments
	public void add(int a, String b, int c) {
		int ib = Integer.parseInt(b);
		System.out.println(a + ib + c);
	}

	// change in sequence of arguments
	public void add(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia + b);
	}
	
//	public int add(int a, int b) {
//		
//	}
	// only by changing return type of a method we can't achieve 
//	compile time polymorphism we have to change arguments
}
