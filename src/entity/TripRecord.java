package entity;
import java.sql.Date;



public class TripRecord {
	private int id;
	private int taskId;
	private int developerId;
	private Date actualTripDate;
	private int actualNumberOfDays;
	private String workContent;
	
	public TripRecord(int newId,int newTaskId,int newDeveloperId,
			Date newActualDate,int newNumDays,String newContent){
		this.id = newId;
		this.taskId = newTaskId;
		this.developerId = newDeveloperId;
		this.actualTripDate = newActualDate;
		this.actualNumberOfDays = newNumDays;
		this.workContent = newContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public Date getActualTripDate() {
		return actualTripDate;
	}

	public void setActualTripDate(Date actualTripDate) {
		this.actualTripDate = actualTripDate;
	}

	public int getActualNumberOfDays() {
		return actualNumberOfDays;
	}

	public void setActualNumberOfDays(int actualNumberOfDays) {
		this.actualNumberOfDays = actualNumberOfDays;
	}

	public String getWorkContent() {
		return workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}
	
	
}
