package idk;

public class Lab8Problem11_3SavingsAccount extends Lab8Problem11_3Account{

	public Lab8Problem11_3SavingsAccount(int id, double balance) {
		super(id,balance);
	}
	
	public void withdraw(double x) {
		if (this.balance - x >= 0)
			super.withdraw(x);
		else
			System.out.println("*Money was not withdrawn from your savings because your withdrawal was larger than your balance*");
	}

	public String getSavings() {
		return "Savings Account Balance: " + this.balance;
	}
}
