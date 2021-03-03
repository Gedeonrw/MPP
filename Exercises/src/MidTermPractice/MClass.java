package MidTermPractice;

public class MClass extends MySuperClass{

	public static void main(String[] args) {
		MySuperClass m = new MClass();
		System.out.println(m.getType());
	}
	
	public int getType() {
		return 3;
	}

}

class MySuperClass{
	public int getType() {
		return 2;
	}
}