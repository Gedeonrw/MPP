package assignement8.q1;

import java.util.function.Supplier;

public class Expression {

	public static void main(String[] args) {
		Supplier<Double> supl = Math::random;
		System.out.println(supl.get());
		

	}

}
