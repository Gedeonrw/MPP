package lab9.q4B;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
	final Stream<Integer> primes = Stream.iterate(2, n->getNextPrime(n));
	PrimeStream(){	
	}
	
	private static int getNextPrime(Integer n) {
		// TODO Auto-generated method stub
		return isPrime(++n)?n:getNextPrime(n);
	}
	
	

	public void printFirstNPrimes(int n) {
		getPrimeStream().limit(n)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
	
	private Stream<Integer> getPrimeStream() {
		// TODO Auto-generated method stub
		//Stream<Integer> operatorStream = primes;
		return primes;
	}

	private static boolean isPrime(int x) {
		int temp = x-1;
		while(temp!=1) {
			if(x%temp==0) return false;
			temp--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeStream ps = new PrimeStream();
		ps.printFirstNPrimes(10);
		System.out.println("====");
	//	ps.printFirstNPrimes(5);	
	}
}
