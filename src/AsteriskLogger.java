import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + ": " + "***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.out.println(date.toString() + ": ");
		System.out.println("******************");
		System.out.println("***Error: " + error + "***");
		System.out.println("******************");
		
	}

}
