package warmUp;

import java.util.function.Supplier;

public class AnnonymousInnerClass {

	public static void main(String[] args) {

  
//		 System.out.println(new Supplier<Double>() {
//
//			@Override
//			public Double get() {
//			return Math.random();
//			}
//			 
//		 }.get());
		
		Supplier<Double> suop = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
			
		};
		System.out.println(suop.get());
}
}