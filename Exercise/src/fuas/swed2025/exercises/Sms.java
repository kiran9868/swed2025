package fuas.swed2025.exercises;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Notification receiveNotification(Notification notification) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
