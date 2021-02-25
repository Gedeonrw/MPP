package lesson11.labs.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainQ4 {
	public static void main(String[] args) {
		
	}
	
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for(Number num : nums) s += num.doubleValue();
		return s;
	}
	
	public static void partA() {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
		//error here
		// nums is list of anything that extends number
		//maybe integer, double or anything extending number
		//adding 3.14 to nums make nums constricted to double only 
		//also voilates get and put principle 
		//<? extends Number> must be used only to read not write 
		nums.add(3.14);

	}
	
	public static void partB() {
		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
		//erroe here
		//nums is anything that is extended or inherited by integer
		//maybe number or object
		//reading as dbl makes it constricted to double
		//voilates get and put principle
		//<? super Integer> must be used only to add or write data not read
		double dbl = sum(ints);
	}
}
