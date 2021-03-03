package equals;

import java.time.LocalDate;

public class PersonWithJob extends Person {
	private Double salary;
	public PersonWithJob(String name, LocalDate dob, Double salary) {
		
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object ob) {
		if(ob == null)return false;
		if(!(ob instanceof  PersonWithJob)) return false;
		 PersonWithJob p = ( PersonWithJob) ob;
		return super.getName().equals(p.getName()) && super.getDateOfBirth().equals(p.getDateOfBirth());
	}
	
public static void main(String[] args) {
		
	PersonWithJob ps1 = new PersonWithJob("John", LocalDate.of(2000, 10, 11),345.5);
	PersonWithJob ps2 = new PersonWithJob("John", LocalDate.of(2000, 10, 11),345.56);
		System.out.println(ps1.equals(ps2));
		


	}

}
