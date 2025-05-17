package fuas.swed2025.exercises;
import java.util.List;
import java.util.ArrayList;

/**
 * This class defines the user and contains the list of Subscriptions contained by a User.
 * 
 * @author Kiran Regmi
 * @version 1.0
 * */

public class User {
	
	private static int idCounter = 0;
	
	private int userId;
	private String userName;
	private String email;
	private List<Subscription> subscription;
	
	
	public User(String userName,String email){
		userId = ++idCounter;
		this.userName = userName;
		this.email = email;
		subscription = new ArrayList<>();
		
	}
	
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;	
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public List<Subscription> getSubscription(){
		return subscription;
	}
	
	/**
	 * User can register a Website and it is then added to the list of Subscription.
	 * 
	 * @param url url of a website.
	 * @param frequency the time when it has to be checked.
	 * @param channel the channel through which the user is notified.
	 * */
	
	public void registerWebsite(String url, Frequency frequency, Channel channel){
		Subscription s = new Subscription(url,frequency,channel);
	
		subscription.add(s);
		
	}
	
	/**
	 * User can modify their Subscriptions.
	 * @param id subscription id to be modified
	 * @frequency the new frequency to be set in a particular subscription.
	 * @channel the new channel through user wants to recive a notification.
	 * 
	 * */
	
	public void modifySubscription(int id,Frequency frequency,Channel channel) {
		for(Subscription s: subscription){
			if(s.getId() == id) {
				s.setChannel(channel);
				s.setFrequency(frequency);
			}
		}
		
	}
	
	/**
	 * User can cancel the Subscription of a Website.
	 * @param id the id of a Subscription that needs to be canceled.
	 * */
	
	public void cancelSubscription(int id) {
		for(Subscription s: subscription) {
			if(s.getId() == id) {
				subscription.remove(s);
			}
		}
	}
	
	/*
	 * User receive a Notification if there is any change in the website content.
	 * */
	
	public void receiveNotification(Notification notification){
		
		System.out.println("NotificationId:" + notification.getId() + " Notification:" +notification.getMessage());
		
		
	}

}
