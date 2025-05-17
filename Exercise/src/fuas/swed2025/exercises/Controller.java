package fuas.swed2025.exercises;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Controller {

	private static Controller controller;

	private Map<Integer, User> users;

	private Controller() {
		users = new HashMap<>();
	}

	public static Controller getInstance() {
		if (controller == null) {
			controller = new Controller();
		}

		return controller;
	}

	public void addUser(User user) {
		users.put(user.getUserId(), user);
	}

	public void performCheck() {

		for (User user : users.values()) {
			List<Subscription> sub = user.getSubscription();

			for (Subscription s : sub) {
				long now = System.currentTimeMillis();
				long interval = s.getFrequency().getIntervalMillis();
				String currentContent = s.getWebsite().getContent();

				if (now - s.getLastChecked() >= interval && !(currentContent.equals(s.getLastContent()))) {
					Notification n = new Notification("Website content changed!!");
					NotificationService.getInstance().deliverNotification(s.getChannel(), user, n);

				}

			}
		}
	}

}
