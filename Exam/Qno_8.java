package exam;

class Threads extends Thread{
	public void run() {
		for (int n = 1;n<=10;n++) {
			System.out.println(n);
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(1500);}catch(Exception e) {}
		}
	}
}
public class Qno_8 {

	public static void main(String[] args) {
		Threads obj = new Threads();
		
		
		obj.start();
		Threads t2 = new Threads();
		t2.start();	}

}
