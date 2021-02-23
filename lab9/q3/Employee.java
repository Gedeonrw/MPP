package lab9.q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary+"]";
	}
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>() {
			{
				add(new Employee("Joe", 50000));
				add(new Employee("Jim", 75000));
				add(new Employee("Tom", 80000));
				add(new Employee("Jim", 70000));
				add(new Employee("Steve", 55000));
				add(new Employee("Jim", 100000));
				add(new Employee("Joe", 59000));
				add(new Employee("Rich", 88000));
			}
		};
		//expected output:
		//[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]

				System.out.println(list.stream()
				.sorted(Comparator.comparing(( Employee e) -> e.getName())
						.thenComparing(e -> e.getSalary(), Comparator.reverseOrder()))
				.collect(Collectors.toList())
		
		);
//				Comparator<Employee> comp = Comparator.comparing(Employee::getName)
//						.thenComparing((e1,e2) -> e2.getSalary() - e1.getSalary());
//				
//				List<Employee> lst = list.stream()
//						.sorted(comp)
//						.collect(Collectors.toList());
//				                            
//				                            
//				
//				
//				System.out.println(lst);
//						
			
	}
}
