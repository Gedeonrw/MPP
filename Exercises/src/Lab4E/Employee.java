package Lab4E;

import java.util.List;

public class Employee {

	private String name;
	private List<Account> accounts;
	private Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void addAccount(Account acct) {
		if(acct == null)
			throw new IllegalArgumentException("Cannot create null account");
		accounts.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for (Account act : accounts) {
			sum += act.computeUpdatedBalance();
		}
		return sum;
	}
}
