package lesson11.labs.prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1A {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		//List<Number> nums = ints; // Compiler error in this line Because of Covariance not supported in Java Generics for the List
		//nums.add(3.14);
	}

}
