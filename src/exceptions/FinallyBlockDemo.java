package exceptions;

public class FinallyBlockDemo {
	
	public static void main(String[] args) {
		try {
			System.out.println("launch browser");
			System.out.println("navigate to facebook page");
			System.out.println("locate first name and type some name");
			System.out.println("locate last name and type some name"+10/0);
			System.out.println("locate sign up button and click");
		}catch(Exception e) {
			System.out.println("element not located");
		}finally {
			System.out.println("inside the finally block");
			System.out.println("close browser");
		}
		System.out.println("try catch completed");
	}

}
