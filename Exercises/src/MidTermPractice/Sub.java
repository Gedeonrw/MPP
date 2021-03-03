package MidTermPractice;

public class Sub extends Super{

	public static void main(String[] args) {
		Super s = new Sub(); //this print static from supper class first
		s.print();
		//same as print()

	}

	public static void print() {
		System.out.println("bye");
	}
}
class Super{
	static void print() {
		System.out.println("Hello");
	}
}