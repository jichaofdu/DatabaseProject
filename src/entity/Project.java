package entity;

public class Project {
	private int id;
	private int managerId;
	private String name;
	private String description;
	
	public Project(int newId,int newManagerId,String newName,String newDescription){
		this.id = newId;
		this.managerId = newManagerId;
		this.name = newName;
		this.description = newDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
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
	
	
}
