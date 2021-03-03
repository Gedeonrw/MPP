package quiz4;

import java.util.ArrayList;
import java.util.List;

public class FindSecondBiggestNumber<T extends Comparable<T>> {
	public static <T extends Comparable<T>>T secondBiggest(List<T> list) {
		T[] arr = toArray(list);
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(arr[j].compareTo(arr[i])==1) {
					arr = swap(arr, i, j);
				}
			}
		}
		return arr[1];
	}
	
	
	public static <T> T[] toArray(List<T> coll) {
		T[] arr = (T[]) new Comparable[coll.size()];
		int k = 0;
		for(T element : coll) {
			arr[k++] = element; 		  
		}
		return arr;	
	}
	
	private static <T extends Comparable<T>>T[] swap(T[] arr, int i, int j) {
		
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(19);
		intList.add(9);
		intList.add(11);
		intList.add(0);
		intList.add(12);
		
		System.out.println(secondBiggest(intList));
	}
}