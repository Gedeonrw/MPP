package flattenArray;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap2 {

	public static void main(String[] args) {
		
		var a1 = new int[] {1,24,6,45};
		var a2 = new int[] {12,223,45,67};
		
		//here we are FlatMap is useful to this example
		
		Stream.of(a1, a2)
		.flatMapToInt(IntStream::of)//return intStream
		.max() //max return OptionalInt
		.ifPresent(System.out::println);
		
		

	}

}
