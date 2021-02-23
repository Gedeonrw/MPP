package assignement8.RambdaAndMethodReference;

import java.util.function.*;

public class Example {
	public static void main(String[] args) {		
		Employee e = new Employee("Dave", 8000);
		Apple a = new Apple(12);
		
		Supplier<String> name = ()-> e .getName();
		evaluator(name);
		
		Consumer<String> setName = (s)->e.setName(s);
		setName.accept("Riki");
		
		Supplier<String> getName = e::getName;
		System.out.println(getName.get());
		
		BiFunction<String, String, Integer> compare = (s1, s2)->s1.compareTo(s2);
		System.out.println(compare.apply("Dave", "Riki"));
		
		BiFunction<Integer, Integer, Double> power = (x, y)->Math.pow(x, y);
		System.out.println(power.apply(2, 5));
		
		Supplier<Double> getWeight = ()->a.getWeight();
		System.out.println(getWeight.get());
		
		Function<String, Integer> parser = (s)->Integer.parseInt(s);
		System.out.println(parser.apply("56"));
		
		Employee newE = new Employee("Sam", 9877);
		EmployeeNameComparator comp = new EmployeeNameComparator();
		
		BiFunction<Employee, Employee, Integer> employeeComparator
			= (e1, e2)->comp.compare(e1, e2);
			
		System.out.println(employeeComparator.apply(e, newE));
			
	}
	
	static void evaluator(Supplier<String> name) {
		System.out.println(name.get());
	}
}
