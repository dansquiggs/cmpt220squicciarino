public class Lab6Problem9_7Test {

	public static void main(String[] args) {
		
		Lab6Problem9_7 account = new Lab6Problem9_7();
		account.setId(1122);
        account.setBalance(20000.0);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
	}

}