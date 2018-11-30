
public class Facility {

	private String name,description;

	public Facility(String name) {
		this.name = name;
		this.description = "";
	}

	public Facility(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
	    String name = this.name +" "+ this.description;
	    return name;
	}
	
	public void Show()
	{
		this.toString();
	}
	
}
