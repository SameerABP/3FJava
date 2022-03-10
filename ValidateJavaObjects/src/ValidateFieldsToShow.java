import java.util.List;
import java.util.ArrayList;

public class ValidateFieldsToShow {

//	public static void main(String[] args) {
//		
//		boolean result = false;
//		Component component = new Component();
//		component.setId("employmentForm");
//		component.setGroup("baseData");
//		component.setType("complex");
//		
//		List<String> elementList = new ArrayList() {{
//	        add("dropDownEmploymentForm");
//	        add("employmentPartTimeBool");
//	        add("employmentPartTimeNumber");
//	    }};
//	    
//		component.setElements(elementList);
//		System.out.println("component : "+ component);
//		
//		
//		Element elements = new Element();
//		
//		elements.setId("typeDropdownPayslip");
//		elements.setComponentId("employmentForm");
//		elements.setType("complexDropDown");
//		List<Object> value = null;
//		
//		if(elements.getType() == "simpleDropDown") {
//			
//			if(elements.getId() == "dropDownEmploymentForm") {
//				value = new ArrayList() {{
//					add("salaryMonthRate");
//				}};
//			}
//			if(elements.getId() == "frequencyDropdownLocalAgreement") {
//				value = new ArrayList() {{
//					add("frequencyPerHour");
//					add("frequencyPerDay");
//					add("frequencyPerMonth");
//				}};
//			}	
//		}else if(elements.getType() == "complexDropDown") {
//			
//			if(elements.getId() == "typeDropdownLocalAgreement") {
//									
//			    List<String> salary = new ArrayList() {{
//			        add("salaryForResult");
//			        add("salaryForBonus");
//			        add("salaryForProductionSupplement");
//			        add("salaryForPerformanceSupplement");
//			        add("salaryForFunctionSupplement");
//			        add("salaryForJobSupplement");
//			        add("salaryForQualificationSupplement");
//			    }};
//			     
//				value = new ArrayList() {{
//					add(salary);
//				}};
//			}
//			
//			if(elements.getId() == "typeDropdownPayslip") {
//				
//			    List<String> salary = new ArrayList() {{
//			        add("salary");
//			    }};
//			    List<String> supplement = new ArrayList() {{
//			        add("salaryForResult");
//			        add("salaryForBonus");
//			        add("salaryForProductionSupplement");
//			        add("salaryForPerformanceSupplement");
//			        add("salaryForFunctionSupplement");
//			        add("salaryForJobSupplement");
//			        add("salaryForQualificationSupplement");
//			    }};
//			    
//				value = new ArrayList() {{
//					add(salary);
//					add(supplement);
//				}};
//			}	
//		}else {
//			value = new ArrayList();
//			
//		}
//		elements.setValue(value);
//		
//		result = validateComponent(component, "employmentForm", "baseData", "complex");
//		System.out.println("result : "+ result);
//		
//		result = validateComponentElement(component, "employmentForm", "employmentPartTimeNumber");
//		System.out.println("result : "+ result);
//		
//		result = validateComponentElementLength(component, "employmentForm", 3);
//		System.out.println("result : "+ result);
//		
//		result = validateElement(elements, "dropDownEmploymentForm", "employmentForm", "complexDropDown");
//		System.out.println("result : "+ result);
//		
//		result = validateElementValue(elements, "dropDownEmploymentForm", elements.getValue());
//		System.out.println("result : "+ result);
//		result = validateElementValue(elements, "typeDropdownPayslip", elements.getValue());
//		System.out.println("result : "+ result);
//	
//		result = validateElementValueType(elements, "dropDownEmploymentForm", elements.getValue(), "double");
//		System.out.println("result : "+ result);
//		result = validateElementValueType(elements, "dropDownEmploymentForm", elements.getValue(), "simpleDropDown");
//		System.out.println("result : "+ result);
//		result = validateElementValueType(elements, "typeDropdownPayslip", elements.getValue(), "complexDropDown");
//		System.out.println("result : "+ result);
//	
//	}
	
	public static boolean validateComponent(Component component, String componentId, String group, String type) {
		
		if(component != null 
				&& (component.getId() != null && componentId != null && component.getId() == componentId)
				&& (component.getGroup() != null && group != null && component.getGroup() == group)
				&& (component.getType() != null && type != null && component.getType() == type)){
				return true;
			}
		return false;		
	}
	
	public static boolean validateComponentElement(Component component, String componentId, String element) {
		
		if(component != null && component.getElements() != null && component.getId() != null
				&& componentId != null && element != null) {
			
			for(int i = 0; i < component.getElements().size(); i++) {
				if(componentId == component.getId()
						&& element == component.getElements().get(i)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean validateComponentElementLength(Component component, String componentId, int elementCount) {
		
		if(component != null && component.getId() != null 
				&& componentId != null && component.getElements() != null
				&& component.getElements().size() == elementCount) {
			return true;
		}
		return false;
	}
	
	public static boolean validateElement(Element element, String elementId, String componentId, String type) {
		
		if(element != null && elementId != null && componentId != null && type != null
			&& element.getId() != null && element.getId() == elementId
			&& element.getComponentId() != null && element.getComponentId() == componentId
			&& element.getType() != null && element.getType() == type){
			return true;
		}
		return false;
	}
	
	public static boolean validateElementValue(Element element, String elementId, List<Object> value) {
		
		if(element != null && elementId != null && value != null
				&& element.getId() != null && element.getId() == elementId
				&& element.getValue().equals(value)) {
				return true;
		}	
		return false;
	}
	
	public static boolean validateElementValueType(Element element, String elementId, List<Object> value, String type) {
		
		if(element != null && elementId != null && type != null && value != null
				&& element.getId() != null && element.getId() == elementId
				&& element.getType() != null && element.getType() == type
				&& element.getValue().equals(value)) {
				return true;
		}	
		return false;
	}
}
