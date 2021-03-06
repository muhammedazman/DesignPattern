
public class SingeltanLogger {
	
	//eager initialized
	//private static SingeltanLogger instance = new SingeltanLogger();
	
	private static SingeltanLogger instance; 
	
	private SingeltanLogger() {}
	
	public static synchronized SingeltanLogger getInstance() {
		if (instance == null) {
			instance = new SingeltanLogger();
		}
		
		return instance;
	}
	
	public void logMessageStart() { System.out.println("Start Logger Message");}
	
	public void logMessageStop() { System.out.println("Stop Logger Message");}
	
	

}
