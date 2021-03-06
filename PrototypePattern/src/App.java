import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> features = new ArrayList();
		features.add("Start Up");
		features.add("Performans Task");
		features.add("Shut Down");
		
		Components components = new Components();
		components.setName("Infraref Goggles");
		components.setFunctionality("Read temperature of Object");
		
		Robot robot = new Robot(1, features, components);
		System.out.println(robot.getId());
		System.out.println(robot.getComponent().getName());
		System.out.println(robot.getComponent().getFunctionality());
		System.out.println(robot.getFeatures());
		
		Robot cloneRobot = robot.clone();
		System.out.println(cloneRobot.getId());
		System.out.println(cloneRobot.getComponent().getName());
		System.out.println(cloneRobot.getComponent().getFunctionality());
		System.out.println(cloneRobot.getFeatures());
		
	}

}
