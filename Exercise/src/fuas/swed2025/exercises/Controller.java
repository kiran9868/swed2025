package fuas.swed2025.exercises;

import java.util.List;
import java.util.ArrayList;

/**
 * A controller class to perform check of  the content change of a website for all users.
 * 
 * @author Kiran Regmi
 * @version 1.0
 */

public class Controller extends Thread {

	
	private List<User> users;

	public Controller() {
		users = new ArrayList<>();
	}

	

	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void run() {
			while (true) {
				for (User user : users) {
					List<Subscription> sub = user.getSubscription();

					for (Subscription s : sub) {
						long now = System.currentTimeMillis();
						long interval = s.getFrequency().getIntervalMillis();
						String currentContent = s.getWebsite().getContent();

						if (now - s.getLastChecked() >= interval && !currentContent.equals(s.getLastContent())) {
							Notification n = new Notification(s.getWebsite().getUrl() + " Website content changed!!");
							NotificationService.getInstance().deliverNotification(s.getChannel(), user, n);
							s.updateLastChecked();
							s.updateLastContent(currentContent);
						}
					}
				}
				try {
				Thread.sleep(3000);
				}catch(InterruptedException e) {
					break;
				}
			}
		} 
		
	}
