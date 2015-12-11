package entity;

import java.sql.Date;
import java.sql.Timestamp;

public class TripTask {
	
	private int id;
	private int managerId;
	private int salesmanId;
	private int projectId;
	private Date date;
	private int numPeople;
	private int numDays;
	private String description;
	private Timestamp handInTime;
	private int status;
	
	public TripTask(int newId,int newManagerId,int newSalesmanId,int newProjectId,Date newDate,int newNumPeople,
			int newNumDays,String newDescription,Timestamp newTime,int newStatus){
		this.id = newId;
		this.managerId = newManagerId;
		this.salesmanId = newSalesmanId;
		this.projectId = newProjectId;
		this.date = newDate;
		this.numPeople = newNumPeople;
		this.numDays = newNumDays;
		this.description = newDescription;
		this.handInTime = newTime;
		this.status = newStatus;
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

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumPeople() {
		return numPeople;
	}

	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getHandInTime() {
		return handInTime;
	}

	public void setHandInTime(Timestamp handInTime) {
		this.handInTime = handInTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
