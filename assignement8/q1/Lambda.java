package assignement8.q1;

import java.util.function.Supplier;

public class Lambda {

	public static void main(String[] args) {
		Supplier<Double> sp = () -> Math.random();
		System.out.println(sp.get());

	}
}
