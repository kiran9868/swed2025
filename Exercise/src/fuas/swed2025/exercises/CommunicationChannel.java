package fuas.swed2025.exercises;

/**
 * Interface representing communication channel which is later implemented by different
 * communication channels.
 *
 * @author Kiran Regmi
 * @version 1.0
 * */

public interface CommunicationChannel {

	public void sendNotification(User user, Notification notification);

}

