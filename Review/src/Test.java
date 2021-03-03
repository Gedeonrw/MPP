import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//List<?> ints = new ArrayList<>();
		//ints.add(1); // false because List<?>is the bounded wildcard parametirise/generic 
		                                       //type which does not allow adding  or getting
		
		
		int []a = {1,2,3,4,5};
		int [] a1 = new int[] {1,2,3,4,5};
	
		int product = Arrays.stream(a1).reduce(1,(x,y) -> x-y);
		System.out.println(product);
		

		
	}

}
