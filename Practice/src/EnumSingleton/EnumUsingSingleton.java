package EnumSingleton;

public class EnumUsingSingleton {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.instance;
		Singleton singleton2 = Singleton.instance;
		System.out.println(singleton1.hashCode()); //they must share the same hashCode
		System.out.println(singleton2.hashCode());
		
		System.out.println(singleton2.welcome());
		

	}

}
