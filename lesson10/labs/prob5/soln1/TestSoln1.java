package lesson10.labs.prob5.soln1;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class TestSoln1 {
	private static Stream<Employee> emps;
	
	@BeforeAll
	public static void setUp() {
		emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
		          new Employee("John", "Sims", 110000),
		          new Employee("Joe", "Stevens", 200000),
		          new Employee("Andrew", "Reardon", 80000),
		          new Employee("Joe", "Cummings", 760000),
		          new Employee("Steven", "Walters", 135000),
		          new Employee("Thomas", "Blake", 111000),
		          new Employee("Alice", "Richards", 101000),
		          new Employee("Donald", "Trump", 100000)).stream();
	}
	
	@Test
	public void testEmployeeFilter() {
		String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		String actual = Main.employeeFilter(emps);
		Assertions.assertEquals(expected, actual);
	}
	
}
