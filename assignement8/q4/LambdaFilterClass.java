package assignement8.q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterClass {

	public long countWords(List<String> words, char c, char d, int len) {
		return words.stream()
				.filter(word->word.contains(Character.toString(c))) 
				//.filter(word->word.contains("" + c))  the same as the above
				.filter(word->!word.contains(Character.toString(d)))
				.filter(word->word.length() == len)
				.collect(Collectors.toList())
				
				.size();
	}

	public static void main(String[] args) {
	
		final List<String> words = 
			    Arrays.asList("Brain", "Head", "Face", "Nose", "Neck", "Shoulder", "Legs");
		
		LambdaFilterClass c = new LambdaFilterClass();

		System.out.println( c.countWords(words, 'e', 'b', 4));
		
	}
	
	}
