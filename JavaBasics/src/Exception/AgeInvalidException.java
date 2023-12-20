package Exception;

public class AgeInvalidException extends Exception 
{
	public AgeInvalidException() {
		super("Age is Invalid !");
	}

	AgeInvalidException(String message)
	{
		super(message);
	}
}
