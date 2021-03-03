package Generics;

public class ContStringOccurancies {

	public static void main(String[] args) {
		
		String[] a = {"aaaa","fgjhs"};
		String target = "aaaa";
		System.out.println(countOccurrences(a, target));

	}

		public static int countOccurrences(String[] arr, String target) {
			int count = 0;
			if (target == null) {
				for (String item : arr) {
					if (item == null) {
						count++;
					}
				}
			} else {
				for (String item : arr) {
					if (target.equals(item)) {
						count++;
					}
				}
			}
			return count;
		}
	}


