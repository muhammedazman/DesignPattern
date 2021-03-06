
public class App {

	public static void main(String[] args) {
		SingeltanLogger logger = SingeltanLogger.getInstance();
		logger.logMessageStart();
		logger.logMessageStop();
	}
}
