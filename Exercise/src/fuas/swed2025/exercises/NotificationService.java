package fuas.swed2025.exercises;


public class NotificationService {
	
	private static NotificationService notificationService;
	
	private NotificationService() {}
	
	public static NotificationService getInstance() {
		if(notificationService == null) {
			notificationService = new NotificationService();
		}
		
		return notificationService;
	}

    public void deliverNotification(Channel channel, User user, Notification notification) {
        CommunicationChannel communicationChannel;

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
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }

        communicationChannel.sendNotification(user, notification);
    }
}
