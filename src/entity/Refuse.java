package entity;

public class Refuse {
	private int id;
	private int taskId;
	private String reason;
	
	public Refuse(int newId,int newTaskId,String newReason){
		this.id = newId;
		this.taskId = newTaskId;
		this.reason = newReason;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
