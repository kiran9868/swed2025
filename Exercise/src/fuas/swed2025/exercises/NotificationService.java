package fuas.swed2025.exercises;

/**
 * This class is responsible for sending a Notification to a user using a specific Communication
 * Channel that a user has choosen during registration of a website.
 *
 * @author Kiran Regmi
 * @version 1.0
 * */

public class NotificationService {

	private static NotificationService notificationService;

	private NotificationService() {}

	public static NotificationService getInstance() {
		if(notificationService == null) {
			notificationService = new NotificationService();
		}

		return notificationService;
	}

	/**
	 * NotificationService send the notification to user using a channel.
	 *
	 * @param channel the channel through which a Notification has to be sent.
	 * @param user user to whom the Notification has to be sent.
	 * @param notification the notification that has to be sent.
	 * */

    public void deliverNotification(Channel channel, User user, Notification notification) {
        CommunicationChannel communicationChannel=null;

        switch (channel) {
            case EMAIL:
                communicationChannel = Email.getInstance();
                break;
            case PUSH:
                communicationChannel = Push.getInstance();
                break;
            case SMS:
                communicationChannel = Sms.getInstance();
                break;
            default:
                System.out.println("Unknown channel: " + channel);
        }

        communicationChannel.sendNotification(user, notification);
    }
}
