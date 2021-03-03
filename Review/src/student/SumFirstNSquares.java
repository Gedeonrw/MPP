package student;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumFirstNSquares {

	public static void main(String[] args) {

		System.out.println(sumFirstNSquares(2));
	}

	public static int sumFirstNSquares(int i) {

		return IntStream.iterate(1, n->n+1).map(n ->n*n).limit(i).sum();

	}

}
