package encapsulation;

public class TestEncapsulationDemo {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "satish", "tester", 50000, "9876543210", "1234");
//		obj.salary = 30000;
		
		obj.dispalyEmpDetails();
		System.out.println(obj.getPhoneNum());
		obj.setPhoneNum("7891230099");
		obj.dispalyEmpDetails();
	}
}
