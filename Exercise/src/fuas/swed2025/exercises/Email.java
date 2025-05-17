package fuas.swed2025.exercises;

/**
 * A class E-Mail that implements the Communication Channel.
 * 
 * @author Kiran Regmi
 * @version 1.0
 * */

public class Email implements CommunicationChannel {
	
	private static Email email;
	
	/**
	 * private constructor so that other cannot initialize it.
	 * */
	
	private Email() {
		
	}
	
	
	/**
	 * Singleton Object of a class-Email.
	 * A single E-mail object is used to send the notification to all users.
	 * 
	 * */
	
	public static Email getInstance() {
		if(email == null) {
			email = new Email();
		}
		
		return email;
	}

    /**
     * the overriden method from the CommunicationChannel Interface.
     * This sends the notification to the user.
     * 
     * @param user the user to whom the notification is to be sent.
     * @param notification that has to be sent to a user.
     * */ 
	
	@Override
	public void sendNotification(User user, Notification notification) {
		
		System.out.println("Notification send through E-Mail Channel");
		System.out.println("Notification sent to: " + user.getEmail());
		user.receiveNotification(notification);
		
	}

	
}