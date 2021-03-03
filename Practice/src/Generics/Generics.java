package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Number> nums = Arrays.asList(1, 2.3, 4.5);
		List<? extends Number> extNum = ints;
		Number i = extNum.get(0);
		//extNum.add(3);
		
		List<? super Number> supNum = nums;
		supNum.add(6);
		supNum.add(3.4);
		//Number i2 = supNum.get(0);
		
		System.out.println("Print form extends");
		extNum.stream().forEach(System.out::println);
		
		System.out.println("Print form super");
		supNum.stream().forEach(x-> System.out.println(x));
		
		
		
		
		
		
//		List<Object> objs = new ArrayList<>();
//		objs.add(1);
//		objs.add("two");
		//List<Integer> objs = new ArrayList<>();
		//objs.add(4);
//		Integer i = (int)objs.get(0);
		//List<? super Integer> ints = objs;
	//	ints.add(3);
	//	double dbl = sum(ints);
		
	//	int i = 9;
	//	Object a = 'k';
	//	accept((int)a);
		
		

//	}
//	public static void accept(int x) {
//		
//	}
//	public static double sum(Collection<? extends Number> nums) {
//		double s = 0.0;
//		for(Number num : nums) s += num.doubleValue();
//		return s;
		 }

}
