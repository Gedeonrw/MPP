package student;


import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private String name;
	private double gpa;
	private LocalDate dateOfAdmission;
	public Student(String name, double gpa, LocalDate dateOfAdmission) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.dateOfAdmission = dateOfAdmission;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	@Override
	
	public int hashCode() {
		return Objects.hash(dateOfAdmission, gpa, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof Student))return false;
		Student s = (Student) obj;
		
		if(this.getDateOfAdmission().equals(s.dateOfAdmission) && this.getGpa()== s.getGpa() && this.getName().equals(s.getName())){
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	public int hashCode() {
//		return Objects.hash(dateOfAdmission, gpa, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) return false;
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Student)) //same class strategy
//			return false;
//		Student other = (Student) obj;
////		return Objects.equals(dateOfAdmission, other.dateOfAdmission)
////				&& Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
////				&& Objects.equals(name, other.name);
//		if(this.dateOfAdmission.equals(other.dateOfAdmission) && this.gpa == other.gpa 
//				&& this.name.equals(other.name)){
//				return true;
//	}
//		return false;
	//}
	
	
	
	

}
