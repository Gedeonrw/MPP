package Threadss;

class Threads extends Thread{
	public void run() {
	for (int i=0;i<10;i++) {
		//System.out.println(i);
		System.out.println(Thread.currentThread().getId()+" Value " +i);
	//will assign 10 to thread 1and 11 to thread2
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
} 
public class Thread1 {

	public static void main(String[] args) {
		Threads t = new Threads();
		t.start(); // here in threading we have to call stRT
		          //because when you call run method it run as normal method.
		 //lets create an order instance and see how thread work
		
		Threads t1 = new Threads();
		t1.start();

	}

}
