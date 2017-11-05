package idk;

public class Lab8Problem11_3CheckingAccount extends Lab8Problem11_3Account{

	protected double overdraft = -100;
	
	public Lab8Problem11_3CheckingAccount(int id, double balance) {
		super(id,balance);
	}
	
	public void withdraw(double x) {
		if (this.balance - x >= overdraft)
			super.withdraw(x);
		else
			System.out.println("*Money was not withdrawn from your checking because it would have exceeded the overdraft limit*");
	}

	public String getChecking() {
		return "Checking Account Balance: " + this.balance;
	}
}