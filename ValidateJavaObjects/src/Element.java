import java.util.ArrayList;
import java.util.List;

public class Element {

	private String id; 
	private String componentId; 
	private String type; 
	private List<Object> value = new ArrayList<Object>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Object> getValue() {
		return value;
	}
	public void setValue(List<Object> value) {
		this.value = value;
	}
				

}
