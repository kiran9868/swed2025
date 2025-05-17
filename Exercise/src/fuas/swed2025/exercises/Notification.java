package fuas.swed2025.exercises;

/**
 * Class to describe the structure of a Notification which contains id and message.
 * 
 * @author Kiran Regmi
 * @version 1.0
 * 
 * 
 * */

public class Notification {
	private static int idCounter = 0;
	private int id;
	private String message;
	
	public Notification(String message) {
		id = ++idCounter;
		this.message = message;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	

}
