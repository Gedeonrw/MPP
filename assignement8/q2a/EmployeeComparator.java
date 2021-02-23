package assignement8.q2a;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.equals(o2)) return 0;            //the answernis 
		else {
			if(o1.name.equals(o2.name)) {
				if(o1.salary < o2.salary) return -1;
				else return 1;
			}
			return o1.name.compareTo(o2.name);
		}
	}

}
