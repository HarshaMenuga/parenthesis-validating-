package threads;

class Counter{
	int count;
	public synchronized void increement(){
		count++;
	}
}
public class Sync_Demo {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1;i<=1000;i++) {
					c.increement();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i =1;i<=1000;i++) {
					c.increement();
				}	
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count :"+c.count);
	}

}
