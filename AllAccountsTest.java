package tretoPaketche;

public class AllAccountsTest {

	public static void main(String[] args) {
		
		SavingsAccount1 Soph = new SavingsAccount1(5236, 60000);
		Soph.withdraw(70000);
		
		CheckingAccount Tedka = new CheckingAccount(8569, 70000, 5000);
		Tedka.withdraw(80000);
		
		System.out.println(Soph.toString() + "\n");
		System.out.println(Tedka.toString());

	}

}
