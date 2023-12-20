package Threads;

// creating our thread using Runnable Interface
public class MyThread implements Runnable {

	@Override
	public void run() 
	{
		// task for thread...
		for(int i=1; i<=10;i++) {
			System.out.println("Value of i is " +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
	
		public static void main(String[] args) {
			// create object of MyThread class
			
			MyThread t1 = new MyThread();
			
			Thread thread = new Thread(t1);
			
			// Object of MyAnotherThread
			
			MyAnotherThread t2 = new MyAnotherThread();
			
			thread.start();
			t2.start();
					
		}
		
	

}
