import java.util.ArrayList;
import java.util.List;

public class Component {

	private String id;
	private String group;
	private String type;
	private List<String> elements = new ArrayList<String>();	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getElements() {
		return elements;
	}
	public void setElements(List<String> elements) {
		this.elements = elements;
	}
	@Override
	public String toString() {
		return "Component [id=" + id + ", group=" + group + ", elements=" + elements + "]";
	}

}