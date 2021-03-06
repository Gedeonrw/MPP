package q2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
		
		}
	public abstract String getName();
	
	public void addMessage(String msg){
		queue.enqueue(msg);
	}
	public String nextMessage(){
		try {
			return queue.dequeue();
		} catch (EmptyQueueException e) {
			//e.printStackTrace();
		}
		return "";
	}
	
}



