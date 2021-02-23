package assignement8.q5;

import java.util.Arrays;
import java.util.List;


public class Lambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
//		list.stream()
//			.map(word->word.toUpperCase())
//			.forEach(word -> System.out.println(word));	
//		
		list.forEach(e -> System.out.println(e.toUpperCase()));
	}
}