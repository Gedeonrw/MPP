package Generics;

public class CountStringOccuracyType {

	public static void main(String[] args) {
		
		String[] a = {"aaaa","fgjhs"};
		String target = "aaaa";
		System.out.println(countOccurrences(a, target));

	}

		public static <T>int countOccurrences(T[] arr, T target) {
			int count = 0;
			if (target == null) {
				for (T item : arr) {
					if (item == null) {
						count++;
					}
				}
			} else {
				for (T item : arr) {
					if (target.equals(item)) {
						count++;
					}
				}
			}
			return count;
		}
	}


