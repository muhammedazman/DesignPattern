
public class SingletonLogger {
	
	//eager initialized
	//private static SingeltanLogger instance = new SingeltanLogger();
	
	private static SingletonLogger instance; 
	
	private SingletonLogger() {}
	
	public static synchronized SingletonLogger getInstance() {
		if (instance == null) {
			instance = new SingletonLogger();
		}
		
		return instance;
	}
	
	public void logMessageStart() { System.out.println("Start Logger Message");}
	
	public void logMessageStop() { System.out.println("Stop Logger Message");}
	
	

}
