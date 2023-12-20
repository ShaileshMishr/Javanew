package Threads;

//Creating thread using Thread class
public class MyAnotherThread extends Thread
{
	public void run()
	{
		// task for thread
		for(int i=10;i>=1;i--) {
			System.out.println("Another thread = " +i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		// create object of MyThread class
		
		MyAnotherThread t1 = new MyAnotherThread();
	
		t1.start();
				
	}
	
}
