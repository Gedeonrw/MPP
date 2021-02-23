package assignement8.q2b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY, DEFAULT};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {
					return e1.name.compareTo(e2.name);
				} else if(method == SortMethod.BYSALARY) {
					if(e1.salary == e2.salary) return 0;
					else if(e1.salary < e2.salary) return -1;
					else return 1;
				} else {
					if(e1.equals(e2)) return 0;
					else {
						if(e1.name.equals(e2.name)) {
							if(e1.salary < e2.salary) return -1;
							else return 1;
						}
						else {
							return e1.name.compareTo(e2.name);
						}
					}
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Joe", 50000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
		
		ei.sort(emps, EmployeeInfo.SortMethod.DEFAULT);
		System.out.println(emps);
	}
}
