package tretoPaketche;

public class AccountTest14 {

	public static void main(String[] args) {
		Account account = new Account(1222, 20000);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance " + account.getBalance() + "\nMonthly interest " + account.getMonthlyInterest()
		+ "\nDate created " + account.getDateCreated());

	}

}
