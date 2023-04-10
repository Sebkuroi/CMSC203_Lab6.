
public class CheckingAccount extends BankAccount {
	private double FEE = 0.15, total_ammount;
	private String accountNumber;
	
	public CheckingAccount(String Name, double Intialbalance) 
	{
		super(Name, Intialbalance);
		this.accountNumber = this.getAccountNumber() + "-10";
		this.setAccountNumber(this.accountNumber);
	}

	public boolean withdraw(double Ammountadded) {
		if ((Ammountadded > this.getBalance()) || (Ammountadded + this.FEE > this.getBalance()))
		 {
			return false; 
		 }
		total_ammount = Ammountadded + FEE;
		return super.withdraw(total_ammount);
	}
}