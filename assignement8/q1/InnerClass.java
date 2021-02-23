package assignement8.q1;

import java.util.function.Supplier;

public class InnerClass {

	public static void main(String[] args) {
		Supplier<Double> spl = (new InnerClass()).new Inner();
		System.out.println(spl.get());

	}
class Inner implements Supplier<Double>{
	@Override
	public Double get() {
		return Math.random();
		
	}
}
}
