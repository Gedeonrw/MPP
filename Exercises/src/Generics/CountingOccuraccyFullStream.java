package Generics;

import java.util.stream.Stream;

public class CountingOccuraccyFullStream {
	
	public static void main(String[] args) {
		String[] a = {"aaaa","fgjhs"};
		String target = "aaaa";
		System.out.println(countOccurrences(a, target));
	}

	public static <T>int countOccurrences(T[] arr, T target) {
return(int) Stream.of(arr).filter(x -> (target == null) ? (x == null) : (target.equals(x))).count();
	}
}
