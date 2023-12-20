package Day1;

public class SwitchExample {

	public static void main(String[] args) {
		
		String day="TUES";
		
		switch(day)
		{
		case "MON":
			System.out.println("It is monday");
			break;
			
		case "TUES":
			System.out.println("It is tuesday");
			break;
			
		case "WED":
			System.out.println("It is wednesday");
			break;
			
		default:
		System.out.println("It is Invalid");
		}
	}

}
