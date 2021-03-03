package Lab4E;

public class CheckingAccount extends Account{
	
	private double balance;
	public double monthlyFee;
	private String accId;
	
	

	public CheckingAccount(double balance, double monthlyFee, String accId) {
		super();
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.accId = accId;
	}

	@Override
	public String getAccount() {
		return accId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
	
		return balance - monthlyFee;
	}

	
}
