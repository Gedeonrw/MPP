package lesson11.labs.prob5;

import java.util.ArrayList;
import java.util.List;

public class SecondSmallest<T extends Comparable<T>> {
	public static <T extends Comparable<T>>T secondSmallest(List<T> list) {
		T[] arr = toArray(list);
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(arr[j].compareTo(arr[i])==-1) {
					arr = swap(arr, i, j);
				}
			}
		}
		return arr[1];
	}
	
	//used this from lesson11.lecture.generics.componentsofarray
	public static <T> T[] toArray(List<T> coll) {
		T[] arr = (T[]) new Comparable[coll.size()];; 
		int k = 0;
		for(T element : coll) {
			arr[k++] = element; 		  
		}
		return arr;	
	}
	
	private static <T extends Comparable<T>>T[] swap(T[] arr, int i, int j) {
		// TODO Auto-generated method stub
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(7);
		intList.add(5);
		intList.add(8);
		intList.add(0);
		System.out.println(secondSmallest(intList));
	}
}
