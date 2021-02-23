package lab9Part2.q10b;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInteger {

	public static void main(String[] args) {
		
		Stream<Integer> myIntStream = Stream.of(1,2,3,4,5,7);
		
		IntSummaryStatistics statistics = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max value is " + statistics.getMax() + " And " +
		                    "Min value is " + statistics.getMin());
		
	}

}
