package Exception;

public class AgeMain {

	public static void main(String[] args) {
		
		int n1=3;
		
		try {
			if(n1<18) {
				throw new AgeInvalidException();
			}
			else {
				System.out.println("Age is Valid");
			}
		}
		catch (AgeInvalidException e) {
			System.out.println("Invalid n1");
			System.out.println(e.getMessage());
		}
		
		
	}

}
