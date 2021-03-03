package lesson10.exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
	List<Account> accounts;
	List<Customer> customers;

	@Before
	public void setUp() {
		Customer c1 = new Customer("1", "Jane", "B");
		c1.makeDeposit(56);
		Customer c2 = new Customer("2", "John", "B");
		c2.makeDeposit(20);
		Customer c3 = new Customer("3", "Mary", "B");
		c3.makeDeposit(78);
		Customer c4 = new Customer("4", "Gedon", "B");
		c4.makeDeposit(20);
		Customer c5 = new Customer("5", "James", "B");
		c5.makeDeposit(89);
		customers = Arrays.asList(c1, c2, c3, c4, c5);
		accounts = Arrays.asList(c1.getCheckingAccount(), c2.getCheckingAccount(), c3.getCheckingAccount(),
				c4.getCheckingAccount(), c5.getCheckingAccount());

	}
	
	@After
	public void  terminate() {
		accounts = null;
		customers = null;
	}

	@Test
	public void testLambda() {
		List<Customer> actual = Problem1.specialAccounts(accounts);
		List<Customer> expected = customers.stream().filter(x -> x.getCheckingAccount().getBalance() > 50)
				.sorted(Comparator.comparing(Customer::getLastName))
				.collect(Collectors.toList());
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLambda1() {
		List<Customer> actual = Problem1.specialAccounts(null);
		assertEquals(null, actual);
	}
	
	@Test
	public void testLambda2() {
		List<Customer> actual = Problem1.specialAccounts(new ArrayList<Account>()); //test for empty arrayList
		assertEquals(null, actual);
	}
	
	@Test
	public void zeroLambda() {
		List<Customer> actual = Problem1.zeroAccounts(accounts);
		List<Customer> expected = customers.stream().filter(x -> x.getCheckingAccount().getBalance() == 0)
				.sorted(Comparator.comparing(Customer::getLastName))
				.collect(Collectors.toList());
		assertEquals(expected, actual);
	}
	
}
