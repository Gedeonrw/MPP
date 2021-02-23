package lab9Part2.q9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
	
	printSquares(4);

	}

	public static void printSquares(int num) {
		
	IntStream nums = IntStream.iterate(1, n -> (int) Math.pow((int)Math.sqrt(n) + 1, 2)).limit(num);
				nums.forEach(System.out::println);
				
	}
	
}
