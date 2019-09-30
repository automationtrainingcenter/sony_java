package bank;

import java.util.Scanner;

public class BaseAccount implements Account {
	private int accNum;
	private String name;
	protected int balance;
	private int pin;

	public BaseAccount(int accNum, String name, int balance, int pin) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}

	@Override
	public void deposite(int amount) {
		if (amount >= 0) {
			this.balance += amount;
			System.out.println("deposite success");
		} else {
			System.out.println("invalid amount... amount must be a positive number");
		}
	}

	@Override
	public int withdraw(int amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin");
		int pin = sc.nextInt();
		if (pin == this.pin) {
			if (amount >= 0) {
				if (this.balance >= amount) {
					this.balance -= amount;
					System.out.println("withdraw success ... please collect your cash");
					return amount;
				} else {
					System.out.println("insufficient balance");
				}
			} else {
				System.out.println("invalid amount");
			}
		} else {
			System.out.println("incorrct pin");
		}
		return 0;
	}

	@Override
	public void updatePin(int pin) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your old pin");
		int oldPin = sc.nextInt();
		if (oldPin == this.pin) {
			this.pin = pin;
			System.out.println("your pin changed successfully");
		}else {
			System.out.println("invalid old pin");
		}
	}
	
	@Override
	public String toString() {
		return "name = "+this.name+"\tbalance = "+this.balance;
	}

}
