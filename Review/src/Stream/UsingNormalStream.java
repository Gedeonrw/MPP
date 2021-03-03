package Stream;

import java.util.stream.IntStream;

public class UsingNormalStream {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,6,78,9,12};
//		int[] nums2 = {};
//		
//		IntStream.of(nums2).min();//.ifPresent(min -> System.out.println(min));
		
		System.out.println(IntStream.of(nums).sum());
		System.out.println(IntStream.of(nums).max());
		System.out.println(IntStream.of(nums).average());
		System.out.println(IntStream.of(nums).min());
		System.out.println(IntStream.of(nums).count());
		//System.out.println(IntStream.of(nums).anyMatch());

	}

}
