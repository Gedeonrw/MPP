package equals;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	Person(String name, LocalDate dob) {
		this.name = name;
		this.dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public boolean equals(Object ob) {
		if(ob == null)return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person) ob;
		return this.name.equals(p.name) && this.dateOfBirth.equals(p.dateOfBirth);
	}
	
public static void main(String[] args) {
		
		Person p1 = new Person("John", LocalDate.of(2000, 10, 11));
        Person p2 = new Person("John", LocalDate.of(2000, 10, 11));
		System.out.println(p1.equals(p2));
		System.out.println();


	}

}
