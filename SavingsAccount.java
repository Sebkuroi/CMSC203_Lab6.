
public class SavingsAccount extends BankAccount {
	private double rate = .0047, intrest = this.getBalance() * this.rate;
	private int savingsNumber = 0 ;
	private String accountNumber;
	
	public SavingsAccount(String Name, double Intialbalance) 
	{
		super(Name, Intialbalance);
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}
	
	public void postInterest() 
	{
		this.setBalance(this.getBalance() + (intrest));
	}

	

	public String getAccountNumber()
	{
		return this.accountNumber + "-" + savingsNumber;
	}
	public SavingsAccount(BankAccount Account , double InitialBalance ) 
	{
		super(Account, InitialBalance);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}
}	