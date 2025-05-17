package fuas.swed2025.exercises;

/**
 * Interface representing communication channel which is later implemented by different
 * communication channels.
 * */

public interface CommunicationChannel {
	
	public void sendNotification(User user, Notification notification);
	
}
	
