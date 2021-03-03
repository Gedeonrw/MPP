package student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.tools.example.debug.tty.EventHandler;

public class StreamEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(evenNumbers(5));
	}
public static List<Integer> evenNumbers(int a) {
	return Stream.iterate(0, n->n+2).limit(a).collect(Collectors.toList());
	
	
}
}
