package idk;

import java.util.ArrayList;
import java.util.Date;

public class Lab8Problem11_3Account {

	protected int id;
	protected double balance;
	protected double annualInterestRate; // AnnualInterestRate is percentage.
	protected Date dateCreated;

	public Lab8Problem11_3Account() {
		dateCreated = new Date();
	}

	public Lab8Problem11_3Account(int id, double balance) {
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