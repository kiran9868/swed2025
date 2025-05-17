package fuas.swed2025.exercises;

/**
 * A class Sms that implements the Communication Channel and implements the method.
 * @author Kiran Regmi
 * @version 1.0
 * 
 * */

public class Sms implements CommunicationChannel{
    
	private static  Sms sms;
	
	private Sms() {}
	
	public static Sms getInstance() {
		if(sms == null) {
			sms = new Sms();
		}
		
		return sms;
	}

	@Override
	public void sendNotification(User user, Notification notification) {
		System.out.println("\nNotification send throughh SMS Channel.");
		System.out.println("Notification sent to: " + user.getUserName());
		user.receiveNotification(notification);
		
	}

	
	
	

}
