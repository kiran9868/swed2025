package fuas.swed2025.exercises;

import java.util.List;
import java.util.ArrayList;

/**
 * A controller class to perform the content change of a website.
 * 
 * @author Kiran Regmi
 * @version 1.0
 * */

public class Controller extends Thread {

	private static Controller controller;
	List<User> users;

	private Controller() {
		users = new ArrayList<>();
	}

	public static Controller getInstance() {
		if (controller == null) {
			controller = new Controller();
		}

		return controller;
	}

	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void run() {
	    try {
	        while (true) {
	            for (User user : users) {
	                List<Subscription> sub = user.getSubscription();

	                for (Subscription s : sub) {
	                    long now = System.currentTimeMillis();
	                    long interval = s.getFrequency().getIntervalMillis();
	                    String currentContent = s.getWebsite().getContent();

	                    if (now - s.getLastChecked() >= interval && !currentContent.equals(s.getLastContent())) {
	                        Notification n = new Notification("Website content changed!!");
	                        NotificationService.getInstance().deliverNotification(s.getChannel(), user, n);
	                        s.updateLastChecked();
	                        s.updateLastContent(currentContent);
	                    }
	                }
	            }
	            Thread.sleep(30000);  
	        }
	    } catch (InterruptedException e) {
	        System.out.println("InterruptedException: " +e.getMessage());
	    }
	}
}