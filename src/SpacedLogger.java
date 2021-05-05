import java.util.Date;

public class SpacedLogger implements Logger      {

	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.print(date.toString() + ": ");
		
		for(int i = 0; i <= log.length() - 1; i++)
		{
			System.out.print(log.charAt(i) + " ");
		}
		
		
	}

	@Override
	public void error(String error) {
		System.out.println(" ");
		Date date = new Date();
		System.out.print(date.toString() + ": ERROR: ");
		
		for(int i = 0; i <= error.length() - 1; i++)
		{
			System.out.print(error.charAt(i) + " ");
		}
		
	}

}
