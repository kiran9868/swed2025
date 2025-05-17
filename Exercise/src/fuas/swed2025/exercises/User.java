package fuas.swed2025.exercises;

import java.util.List;
import java.util.ArrayList;
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
	
	public void registerWebsite(String url, Frequency frequency, Channel channel){
		Subscription s = new Subscription(url,frequency,channel);
	
		subscription.add(s);
		
	}
	
	public void modifySubscription(int id,Frequency frequency,Channel channel) {
		for(Subscription s: subscription){
			if(s.getId() == id) {
				s.setChannel(channel);
				s.setFrequency(frequency);
			}
		}
		
	}
	
	public void cancelSubscription(int id) {
		for(Subscription s: subscription) {
			if(s.getId() == id) {
				subscription.remove(s);
			}
		}
	}
	
	public void receiveNotification(Notification notification){
		
		
	}

}
