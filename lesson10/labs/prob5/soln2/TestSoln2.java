package lesson10.labs.prob5.soln2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSoln2 {
	private static Employee emp;
	private static Employee emp1;
	
	@BeforeAll
	public static void setUp() {
		emp = new Employee("John", "Sims", 110000);
		emp1 = new Employee("Sam", "Johnson", 9000);
	}
	
	@Test
	public void testSalaryGreaterThan100000() {
		boolean actual = Main.salaryGreaterThan100000(emp);
		Assertions.assertTrue(actual);
		actual = Main.salaryGreaterThan100000(emp1);
		Assertions.assertFalse(actual);
	}
	
	@Test
	public void testLastNameAfterM() {
		Assertions.assertTrue(Main.lastNameAfterM(emp));
		Assertions.assertFalse(Main.lastNameAfterM(emp1));
	}
	
}
