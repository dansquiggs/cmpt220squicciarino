package idk;

public class Lab8Problem11_3AccountTest {

	public static void main(String[] args) {
		
		// original test
		Lab8Problem11_3Account account = new Lab8Problem11_3Account();
        account.setId(1234);
        account.setBalance(0);
		account.setAnnualInterestRate(2);
        account.withdraw(2500);
        account.deposit(3000.0);
        System.out.println("ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
	
        // additional tests for checking/savings accounts
        Lab8Problem11_3CheckingAccount checking = new Lab8Problem11_3CheckingAccount(1234,500);
        checking.withdraw(601);
        Lab8Problem11_3SavingsAccount savings = new Lab8Problem11_3SavingsAccount(1234,500);
        savings.withdraw(501);
        System.out.println(checking.getChecking());
        System.out.println(savings.getSavings());
        
	}
}
