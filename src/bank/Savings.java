package bank;

public class Savings extends BaseAccount {
	private final int MIN_BALANCE = 5000;
	{
		// instance initialization blocks
		if(MIN_BALANCE > this.balance) {
			throw new RuntimeException("object creation failed");
		}
	}
	public Savings(int accNum, String name, int balance, int pin) {
		super(accNum, name, balance, pin);
	}
	@Override
	public int withdraw(int amount) {
		int amt = super.withdraw(amount);
		if(amt > 0 && this.balance < this.MIN_BALANCE) {
			this.balance -= 200;
			System.out.println("applied fine");
		}
		return amt;
	}
	
	

}
