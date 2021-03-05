
public class App {

	public static void main(String[] args) {
		
		ComputerFactory computerFactory = new ComputerFactory();
		computerFactory.getComputer("Laptop").compute();
		
		ComputerFactory computerFactory2 = new ComputerFactory();
		computerFactory2.getComputer("Phone").compute();
		
		ComputerFactory computerFactory3 = new ComputerFactory();
		computerFactory3.getComputer("SmartTv").compute();
	}
}
