package basics;

public class InstanceVsStatic {
	
	int i;
	static int j;
	
	public void display() {
		System.out.println("i = "+i+"\tj = "+j);
	}
	
	public static void main(String[] args) {
		//assign some value to the static variable
		j = 100;
		
		// create an object 
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.i = 10;
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.i = 20;
		
		InstanceVsStatic obj3 =  new InstanceVsStatic();
		obj3.i = 30;
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj2.i = 25;
		
		j = 400;
		obj1.display();
		obj2.display();
		obj3.display();
	}

}
