package student;

import java.util.Arrays;

public class ArrayFlaterner {

	public static void main(String[] args) {
		
		int[][] a = {{1,3},{0},{4,5,9}};
		
		System.out.println(Arrays.toString(flattenArray(a)));
		System.out.println(Arrays.toString(flattenArray2(a)));

	}
	
public static int[] flattenArray(int [][] arr) {
	int size = 0;
	for (int[] in : arr) {
		size += in.length;
	}
	int newArray[]  = new int[size];
	size = 0;
	 for (int[] in : arr) {
		 for (int inn : in) {
			 
		  newArray[size++] = inn;
	 }
	 }
	return newArray;
	}

public static int[] flattenArray2(int [][] arr) {
	return Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x)).toArray();
}
}
