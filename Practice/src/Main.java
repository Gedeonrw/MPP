public class Main {

	public static void main(String[] args) {
		class TestEven implements TestNumber {
			@Override
			public boolean test(int n) {
				return n % 2 == 0;
			}
		}
		TestNumber te1 = new TestNumber() {
			@Override
			public boolean test(int n) {
				return n % 2 == 0;
			}
		};
//		TestNumber te2 = (int e) -> {
//
//			return e % 2 == 0;
//		};
		
		TestNumber te2 = (int r) -> {
			return r % 2==0;
		};
		
		TestNumber t3 = r -> r%2==0;

	
		
		TestEven te = new TestEven();
		System.out.println(te.test(6));
		System.out.println(te1.test(6));
		
		System.out.println(t3.test(6));
	}
}
