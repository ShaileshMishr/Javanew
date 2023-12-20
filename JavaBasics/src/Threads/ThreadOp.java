package Threads;

class UserThread extends Thread{
	public void run()
	{
		// task for thread....
		System.out.println("This is user defined thread.");
	}
}





public class ThreadOp {

	public static void main(String[] args)  {
		System.out.println("Program started....");
		int x=56+34;
		System.out.println("Sum is "+x);
		//Thread....
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("Current running thred is "+tname);
		
		// setName
		t.setName("MyMain");
		System.out.println(t.getName());
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
		
		System.out.println(t.getId());
		
		System.out.println("Program ended....");
		
		// Going to start user defined thread.
		UserThread thread = new UserThread();
		thread.start();
		

	}

}
