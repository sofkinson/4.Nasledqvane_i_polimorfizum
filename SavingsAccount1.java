package tretoPaketche;

public class SavingsAccount1 extends Account {
	
	public SavingsAccount1(int id, double balance) {
		super (id, balance);
	}
	
	public void withdraw (double draw) {
		if(balance >= draw) {
			balance -= draw;	
		}
		
	}
	
	public String toString() {
		return super.toString() + " Savings account";
	}


}
