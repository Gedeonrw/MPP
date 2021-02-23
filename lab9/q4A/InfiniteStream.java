package lab9.q4A;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class InfiniteStream {

	static Predicate<Integer> isPrimeLambda = a -> {
		if (a < 2)
			return false;
		for (int i = 2; i <= a / i; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	};

	static Function<Integer, Integer> nextPrimeLambda = n -> {
		for (int i = n + 1;; i++)
			if (isPrimeLambda.test(i))
				return i;
	};

	static final Stream<Integer> primes = Stream.iterate(2, nextPrimeLambda::apply);

	public static Stream<Integer> getPrimes() {
		return primes;
	}
	public static void main(String[] args) {
		getPrimes().forEach(System.out::println);				
	}
}
