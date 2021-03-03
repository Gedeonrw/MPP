package javaChallenges;

public class NumberOfChar {

	public static void main(String[] args) {
		String s = "xyxxxoxu";
		char e = 'x';
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == e) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
