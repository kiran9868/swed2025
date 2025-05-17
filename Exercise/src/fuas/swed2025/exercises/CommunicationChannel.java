package fuas.swed2025.exercises;

public interface CommunicationChannel {
	
	public void sendNotification(User user, Notification notification);
	public Notification receiveNotification(Notification notification);
	

}
