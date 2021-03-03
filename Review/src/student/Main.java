package student;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
	
	Student s1 = new Student("James", 3.2, LocalDate.of(2020, 12, 4));
	Student s2 = new Student("James", 3.2, LocalDate.of(2020, 12, 4));
	

	System.out.println(s1.equals(s2));

	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	}
}
