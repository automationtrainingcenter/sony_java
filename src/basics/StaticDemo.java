package basics;

public class StaticDemo {
	
	int i = 0;
	static int j = 0;

	public void increment() {
		i = i+1;
		j = j+1;
		System.out.println("i = "+i+"\tj = "+j);
	}
	
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();	
		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
		obj1.increment();
		obj2.increment();
		obj2.increment();
		obj2.increment();
		obj3.increment();
	}
}
