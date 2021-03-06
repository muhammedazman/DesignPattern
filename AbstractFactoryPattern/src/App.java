
public class App {

	public static void main(String[] args) {
		AbstractFactory factoryProducer = FactoryProducer.getFactory(false);
		ComputerFactory computerFactory =  (ComputerFactory) factoryProducer;
		computerFactory.getComputer("Laptop").getCompute();
		
		AbstractFactory factoryProducer2 = FactoryProducer.getFactory(true);
		PortableFactory portableFactory = (PortableFactory) factoryProducer2;
		portableFactory.getComputer("Phone").getCompute();
	}

}
