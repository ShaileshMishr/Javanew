package Day1;

public class BreakContinueExample {

	public static void main(String[] args) {
		
		System.out.println("Break Condition...........");
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
			
			if(i>=50) {
				break;
			}
			}
		System.out.println("Break Condition end........");

		
		System.out.println("Continue Condition............");
		for (int i=1; i<=100; i++) {
			
			
			if(i==50) {
				continue;
			}
			System.out.println(i);
			}
	}

}
