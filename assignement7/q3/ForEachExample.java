package assignement7.q3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

	          list.forEach(new myUpperCase());
}
	
	static class myUpperCase implements Consumer<String>{

		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
			
		}
		
	}
	
	
}