package encapsulation;

import java.util.Scanner;

/*
 * Encapsulation means hiding data from the outside world
 * or binding data and the operations we can perform on data
 * together
 * 
 * to hide the properties outside the class we have to declare properties
 * using private keyword
 * 
 */
public class EncapsulationDemo {
	private int id;
	private String name;
	private String designation;
	private int salary;
	private String phoneNum;
	private String passcode;
	
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your passcode");
		String pcode = sc.next();
		if(this.passcode.equals(pcode)) {
			this.phoneNum = phoneNum;
		}else {
			System.out.println("invalid credentials");
		}	
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public EncapsulationDemo(int id, String name, String designation, int salary, String phoneNum, String passcode) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.phoneNum = phoneNum;
		this.passcode = passcode;
	}

	public void dispalyEmpDetails() {
		System.out.println("id = " + id + "\nname = " + name + "\ndesignation = " + designation + "\nsalary = " + salary
				+ "\nphone num = " + phoneNum);
	}

}
