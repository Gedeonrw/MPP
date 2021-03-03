
//inheritance and polymorphysm

package javaChallenges;

public class A {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
//	/* Unknown to subclasses */
//	public void newMethod(String suffix) {
//		name += suffix;
//	}
	 
//	void call() {
//		System.out.println("calling");
//	}
//	public void move() {
//		System.out.println("Moving");
//	}
	}


class B extends A{
	public void setName(String name) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Illegal name input");
		}
		super.setName(name);
	}
//	void set() {
//		System.out.println("setting");
//	}
}


//class C extends B{
//	void get() {
//		System.out.println("getting");
//	}
//}


