package lesson10.labs.prob6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
	private static Queue que= new Queue();
	private static Executor exec = Executors.newCachedThreadPool();
	
	public static void main(String[] args) {	
		for(int i = 0; i < 10; ++i) {
			multipleCalls();
			System.out.println("Tail Node Value: "
			       + que.getTailValue());
		}
	}
	
	public static void multipleCalls() {
		Runnable r = () -> {
			for(int i = 0; i < 5000; ++i) {
				que.add(i);
			}
		};
		for(int i = 0; i < 100; ++i) {
			exec.execute(r);		
		}
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {}
	}
}
