package lesson11.labs.prob1;

import java.util.List;
import java.util.ArrayList;

public class Prob2B {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		
		//nums.add(3.14); // Put or write for ? extends wildcard is not supported in java
		                   // we can only read like System.out.println(nums.get(0));
	}

}
