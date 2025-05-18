package fuas.swed2025.exercises;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   String str;
		
	   User user = new User("Kiran","regmikiran1@gmail.com");
	   user.registerWebsite("google.com",Frequency.SEC ,Channel.PUSH);
	   user.registerWebsite("facebook.com", Frequency.SEC, Channel.EMAIL);
	   
	   User user1 = new User("Regmi","regmi@gmail.com");
	   user1.registerWebsite("twitter.de", Frequency.MSEC, Channel.EMAIL);
	   
	   Controller controller = new Controller();
	   controller.setDaemon(true);
	   controller.addUser(user);
	   controller.addUser(user1);
	   
	   user.getSubscription().get(0).getWebsite().setContent("Old Content"); 
	           
	   
	   user.getSubscription().get(0).getWebsite().setContent("Hello");
	   
       user1.getSubscription().get(0).getWebsite().setContent("Old Content"); 
	   user1.getSubscription().get(0).getWebsite().setContent("Hello");
	   
	   
	   controller.start();
	   
	   while(true) {
		
	   System.out.print("Enter the content of a Website: ");
	   str = sc.nextLine();
	   
	   
	   
	   user.getSubscription().get(0).getWebsite().setContent(str);
	   
	   if(str.toUpperCase().equals("Q")) {
		   System.out.println("Program terminated");
		   break;
	   }
	   
	   
	   
	   }
	   sc.close();
	   
	}

}
