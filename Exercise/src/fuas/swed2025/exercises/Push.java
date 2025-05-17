package fuas.swed2025.exercises;

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
		user.receiveNotification(notification);
		
	}

	
	
	

}
