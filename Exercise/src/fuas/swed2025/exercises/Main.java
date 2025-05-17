package fuas.swed2025.exercises;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
	   User user = new User("Kiran","regmikiran1@gmail.com");
	   user.registerWebsite("google.com",Frequency.SEC ,Channel.PUSH);
	   
	   User user1 = new User("Regmi","regmikiran1@gmail.com");
	   user1.registerWebsite("faceboook.com", Frequency.SEC, Channel.SMS);
	   
	   Controller controller = Controller.getInstance();
	   controller.addUser(user);
	   
	   user.getSubscription().get(0).getWebsite().setContent("Old Content"); 
	           
	   
	   user.getSubscription().get(0).getWebsite().setContent("Hello");
	   
	   controller.start();
	   
	   while(true) {
		
	   System.out.print("Enter the content of a Website: ");
	   str = sc.nextLine();
	   
	   user.getSubscription().get(0).updateLastContent(str);
	   
	   if(str.toUpperCase().equals("q")) {
		   break;
	   }
	   
	   
	   
	   }
	   sc.close();

	   
	   
	   
		
	}

}
