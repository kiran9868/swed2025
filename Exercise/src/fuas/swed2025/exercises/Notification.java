package fuas.swed2025.exercises;

public class Notification {
	private static int idCounter = 0;
	private int id;
	private String message;
	
	public Notification(String message) {
		id = idCounter++;
		this.message = message;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void deliver(Channel channel,Notification notification) {
		
		if (channel.name().equals("EMAIL")) {
		    Email email = Email.getInstance();
		    email.receiveNotification(notification);
		}else if(channel.name().equals("PUSH")) {
			Push push = Push.getInstance();
			push.receiveNotification(notification);
		}else if(channel.name().equals("SMS")) {
			Sms sms = Sms.getInstance();
			sms.receiveNotification(notification);
		}

		
	}

}
