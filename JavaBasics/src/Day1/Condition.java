package Day1;

public class Condition {

	public static void main(String[] args) {
		
		int n=-12;
		if(n>0) 
		{
			// if body: true block
			System.out.println("Yes It is");
		}
		else {
			// false block
			System.out.println("It is Incorrect");
		}
		
		// laded if
		
		int m=83;
		if(m>90) {
			System.out.println("Grade A");
		}
		else if(m>80 && m<=90){
			System.out.println("Grade B");
		}
		else {
			System.out.println("Fail");
		}
		
		// nested if
		
		int num=142;
		if(num>0)
		{
			if(num%2==0) {
				System.out.println("It is even and greater than zero");
			}
			else {
				System.out.println("Either zero or ODD");
			}
		}
		
	}

}
