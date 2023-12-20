package Day1;

public class LoopExample {

	public static void main(String[] args) {
		
		// print 1 to 10
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		
		// print 1 to 10 gap two numbers
		System.out.println("print 1 to 10 gap two numbers");
				for(int i=1; i<=10;i=i+2)
				{
					System.out.println(i);
				}

				// print 1o to 1 numbers
				System.out.println("print 10 to 1");
						for(int i=10; i>0;i--)
						{
							System.out.println(i);
						}
						
					// while loop // entry control loop
						System.out.println("While loop");
						int j=100;
						while(j<=110)
						{
							System.out.println(j);
							j++;
						}
						
				
						// do while loops  // exit control loops
						System.out.println("Do while Loop");
						int k=111;
						do {
							// statement
							System.out.println(k);
							k++;
						}while(k<=110);
						
						
						//  For Each loop
						System.out.println("For Each loop");
						int nums[] = {12,13,14,15};
						for(int x:nums)
						{
							System.out.println(x);
						}
	}

}
