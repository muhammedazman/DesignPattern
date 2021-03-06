import java.util.List;

public class Robot implements Cloneable {
	
	private int Id;
	private List<String> features;
	private Components component;
	
	
	public Robot(int id, List<String> features, Components component) {
		Id = id;
		this.features = features;
		this.component = component;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public List<String> getFeatures() {
		return features;
	}


	public void setFeatures(List<String> features) {
		this.features = features;
	}


	public Components getComponent() {
		return component;
	}


	public void setComponent(Components component) {
		this.component = component;
	}


	@Override
	protected Robot clone() {	
		try {
			return (Robot) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
