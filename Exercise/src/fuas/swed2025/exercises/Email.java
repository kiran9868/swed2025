package fuas.swed2025.exercises;

public class Email implements CommunicationChannel {
	
	private static Email email;
	
	private Email() {
		
	}
	
	public static Email getInstance() {
		if(email == null) {
			email = new Email();
		}
		
		return email;
	}


	@Override
	public void sendNotification(User user, Notification notification) {
		
		user.receiveNotification(notification);
		
	}

	
}