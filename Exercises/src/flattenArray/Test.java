package flattenArray;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String[] str = {"James","jimmy","jane"};
		Stream<String> strm = Stream.of(str);
		strm.map(e -> e.length())//.forEach(System.out::println);
		.forEach(e -> System.out.println(e));
		

	}

}
