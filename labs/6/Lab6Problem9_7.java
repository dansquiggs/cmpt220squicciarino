import java.util.Date;

public class Lab6Problem9_7 {
	
	private int id;
	private double balance;
	private double annualInterestRate; // AnnualInterestRate is percentage.
	private Date dateCreated;

	public Lab6Problem9_7() {
		dateCreated = new Date();
	}

	public Lab6Problem9_7(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	// get/set id
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// get/set balance
	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// get/set annual interest rate
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// get date created
	
	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	// calculate monthly interest rate
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12 ;
	}
	
	// get monthly interest
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// withdraw method
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	// deposit method
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}