package Lab4E;

import java.util.List;

public class Admin {

	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0.0;
		for (Employee emp: list) {
			sum += emp.computeUpdatedBalanceSum();
			}
		return sum;
	}
}