package Lab4E;

public class SavingsAccount extends Account{

	private double balance;
	private double interestRate;
	private String accId;
	
	public SavingsAccount(double balance, double interestRate, String accId) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accId = accId;
	}

	
	@Override
	public String getAccount() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		
		return balance + (interestRate * balance);
	}

}
