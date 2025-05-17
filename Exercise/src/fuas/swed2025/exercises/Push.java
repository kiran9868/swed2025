package fuas.swed2025.exercises;

/**
 * A class Push that implements the Communication Channel and implements the method.
 * 
 * @author Kiran Regmi
 * @version 1.0
 * */

public class Push implements CommunicationChannel {

	private static Push push;
	
	private Push() {}
	
	public static Push getInstance() {
		if(push == null) {
			push = new Push();
		}
		
		return push;
	}

	@Override
	public void sendNotification(User user , Notification notification) {
		System.out.println("\nNotification sent through Push Channel.");
		System.out.println("Notification sent to: " + user.getUserName());
		user.receiveNotification(notification);
		
	}

	
	
	

}
