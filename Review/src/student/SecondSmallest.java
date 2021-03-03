package student;

import java.util.Arrays;
import java.util.Optional;

public class SecondSmallest {

	public static void main(String[] args) {
		//int[] inputArray = {1,4,5,2,0};
		int[] inputArray1  = null;
		int[] inputArray2 = {};
		int[] inputArray3 = {14};
		int[] inputArray4 = {1,2,3,4,5};
		int[] inputArray5 = {19,9,11,0,12};
		int[] inputArray6 = {19,9,11,0,9};
		
		Optional<Integer> optional = findSecondSmallest(inputArray1);
		optional.ifPresentOrElse(o -> System.out.printf("Second Smallest of %s is : %s\n",Arrays.toString(inputArray1), o),
		            () ->System.out.println("Second smallest of array, null is: Not available "));
		
		Optional<Integer> optional1 = findSecondSmallest(inputArray2);
		optional1.ifPresentOrElse(o -> System.out.printf("Second Smallest of %s is : %s\n",Arrays.toString(inputArray2), o),
		            () ->System.out.println("Second smallest of array, [ ] are: Not available "));
		
		Optional<Integer> optional2 = findSecondSmallest(inputArray3);
		optional2.ifPresentOrElse(o -> System.out.printf("Second smallest of %s is %s\n", Arrays.toString(inputArray3), o),
		       () -> System.out.println("array containing only the one integer value/element ," + Arrays.toString(inputArray3)));
 
	//	System.out.printf("Second biggest of %s is %d\n", Arrays.toString(inputArray4),findSecondSmallest(inputArray4));
		System.out.println("Second smallest of " + Arrays.toString(inputArray5)+ " is " +findSecondSmallest(inputArray5).get());
		System.out.println(findSecondSmallest(inputArray6).get());

	}
public static Optional <Integer>findSecondSmallest(int[] a) {
	if(a == null || a.length <2) return Optional.empty();
	int smallest = a[0] < a[1] ? a[0] : a[1];
	int secondSmallest = smallest == a[0]?a[1]:a[0];
	for (int i=2;i<a.length;i++) {
		if(a[i] < smallest) {
			secondSmallest = smallest;
			smallest = a[i];
		}
		else if (a[i] < secondSmallest) {
			secondSmallest = a[i];
		}
		
	}
	return Optional.of(secondSmallest);
	
}
}
