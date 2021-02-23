package assignement8.q1;

import java.util.function.Supplier;

public class AnnonymousInnerClass {

	public static void main(String[] args) {

  
		 System.out.println(new Supplier<Double>() {

			@Override
			public Double get() {
			return Math.random();
			}
			 
		 }.get());
}
}