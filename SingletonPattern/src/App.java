
public class App {

	public static void main(String[] args) {
		SingletonLogger logger = SingletonLogger.getInstance();
		logger.logMessageStart();
		logger.logMessageStop();
	}
}
