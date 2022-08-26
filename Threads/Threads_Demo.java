package threads;

public class Threads_Demo {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() ->  
				{
				for(int i=1;i<=5;i++) {
					System.out.println("Hi");
					try{Thread.sleep(1000);}catch(Exception e){}
				}	
		});
		Thread t2 =new Thread(() ->{
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
					try{Thread.sleep(1000);}catch(Exception e){}
				}
		});
		
		t1.setName("Hi_Thread");  // Set Name to the Thread
		
		System.out.println(t1.getName());   //  Print name of the Thread
		
		t1.start();
		System.out.println("Thread_1 is "+t1.getState()+" State"); // It checks Thread is running or not
		
		System.out.println("Thread_1 is in active state : "+t1.isAlive());  // it checks thread is alive nor not
		
		try{Thread.sleep(10);}catch(Exception e){}
		
		t2.setName("Hello_Thread");  // Set Name to the Thread
		
		System.out.println(t2.getName());   //  Print name of the Thread
		t2.start();
		System.out.println("Thread_2 is in active state : "+t2.isAlive());  // it checks thread is alive nor not
		
		System.out.println("Thread_1 is "+t2.getState()+" State");  // it checks thread is alive nor not
		try{Thread.sleep(10);}catch(Exception e){}
		t1.join();
		t2.join();
		System.out.println("Thread_1 is in active state : "+t2.isAlive());  // it checks thread is alive nor not
		
		System.out.println("Thread_2 is in active state : "+t2.isAlive());  // it checks thread is alive nor not
		
		System.out.println("Thread_1 is "+t1.getState()+" State");  // it checks thread is alive nor not
		
		System.out.println("Thread_2 is "+t2.getState()+" State");  // it checks thread is alive nor not
		System.out.println("Bye......!");	
		t1.stop();
		t2.stop();
	}

}
