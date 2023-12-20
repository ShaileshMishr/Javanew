package Exception;

public class Example {

	public static void main(String[] args) {
		System.out.println("Started.....");
		try
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			//int n1=10;
			//int n2=1;
			System.out.println("We have got two numbers...");
			int result =  n1/n2;
			System.out.println("Division is "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("n2 can not be 0 !!");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am in finally block");
			System.out.println("Closing all the resources...");
		}
			System.out.println("Terminated....");
	
	}

}
