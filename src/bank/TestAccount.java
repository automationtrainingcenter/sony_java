package bank;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select your account type");
		String accType = sc.next();
		Account acc = null;
		
		if (accType.equalsIgnoreCase("savings")) {
			acc = new Savings(100200300, "surya", 50000, 1010);
		} else if (accType.equalsIgnoreCase("current")) {
			acc = new Current(100200300, "surya", 55000, 1010);
		} else {
			acc = new BaseAccount(100200300, "surya", 5000, 1010);
		}
		
		System.out.println(acc);

		acc.deposite(10000);
		System.out.println(acc);

		acc.withdraw(55000);
		System.out.println(acc);
	}

}
