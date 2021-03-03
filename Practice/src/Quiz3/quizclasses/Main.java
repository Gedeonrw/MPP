package Quiz3.quizclasses;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		System.out.println("Sample Problem - solved");
		List<Employee> sampleData = EmployeeTestData.getList();
		//SAMPLE: Create a stream pipeline that does the following:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		// Expected output: [<name: Timothy salary: 50000 year of birth: 1996>, <name: Ricardo salary: 50000 year of birth: 1988>]

				List<Employee> result = sampleData.stream()
							        .filter(e -> e.getName().length() > 5)
							        .filter(e -> e.getYearOfBirth() > 1970)
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Create a stream pipeline that obtains a list of
	//all name/salary pairs extracted from the list of Employees
	//for which salary is at least 60000 but less than 130000, in ascending
	//order of name, then descending order of salary.
	//Then, print the list to the console.
	// Expected output: 60k - 130k earners, sorted: [(Andy, 60000.0), (Joe, 100000.0), (Joe, 90000.0)]
	public static void prob1() {
		//use this list
		
		List<Employee> list = EmployeeTestData.getList();
		
		List<Pair> pair = list.stream()
		.filter(x -> x.getSalary() >= 60000 && x.getSalary() < 130000)
		.map(x -> new Pair(x.getName(), x.getSalary()))
		.sorted(Comparator.comparing((Pair p) -> p.name)
				.thenComparing(p -> p.salary,Comparator.reverseOrder()))
		.collect(Collectors.toList());
		
				System.out.println(pair);
		
	    
	    		
		    		   
		    		   
				
		
		
	}
	
	//Create a stream pipeline to find all transactions from year 2011 
	//and sort them by value (small to high), and print to console
	//(Note: there is an instance variable "value" in Transaction)
	// Expected output: [{Trader:Brian in Cambridge, year: 2011, value:300}, {Trader:Raoul in Cambridge, year: 2011, value:400}]
	public static void prob2() {
		//use this list	
		List<Transaction> list = TraderTransactTestData.getTransactions();
	
		
		List<Transaction> transaction = list.stream()
		.filter(x -> x.getYear() == 2011)
		.sorted(Comparator.comparing(t -> t.getValue()))
		.collect(Collectors.toList());
		
		System.out.println(transaction);
		
	}
	
	// Create a stream pipeline to find all traders from Cambridge, 
	// sort them by name, and print to console
	// Expected output: [Trader:Alan in Cambridge, Trader:Brian in Cambridge, Trader:Raoul in Cambridge]
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions(); 
		List<Trader> lst = list.stream()
				.map(t -> t.getTrader())
				.filter(t -> t.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(e -> e.getName()))
				.collect(Collectors.toList());
		
		System.out.println(lst);

	                
	}
}
