package fuas.swed2025.exercises;

public class Main {
	public static void main(String[] args) {
		
	   User user = new User("Kiran","regmikiran1@gmail.com");
	   user.registerWebsite("google.com",Frequency.SEC ,Channel.EMAIL);
	   
	   Controller controller = Controller.getInstance();
	   controller.addUser(user);
	   
	// After registerWebsite
	   user.getSubscription().get(0).getWebsite().setContent("Old Content"); // Initial dummy content
	   user.getSubscription().get(0).updateLastContent("Old Content");          // Explicitly set last content

	   // Now simulate content change
	   user.getSubscription().get(0).getWebsite().setContent("Hello");
	   
	   controller.performCheck();

	   
	   
	   
		
	}

}
