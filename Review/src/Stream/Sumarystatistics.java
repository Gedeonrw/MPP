package Stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Sumarystatistics {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,5,6,78,9,12};
		
		IntSummaryStatistics samary = IntStream.of(nums).summaryStatistics();
		
	
		System.out.println(samary.getMin());
		System.out.println(samary.getMax());
		System.out.println(samary.getAverage());
		System.out.println(samary.getCount());
		System.out.println(samary.getSum());

	}

}
