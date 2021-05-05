
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		logger.log("Hello");
		
		logger.error("Hello");
		
		spacedLogger.log("Hello");
		
		spacedLogger.error("Hello");

	}

}
