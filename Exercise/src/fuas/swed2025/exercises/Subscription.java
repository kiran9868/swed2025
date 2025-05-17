package fuas.swed2025.exercises;

public class Subscription {
	
	private static int idCounter =0;
	private int id=0;
	private String url;
	private Frequency frequency;
	private Channel channel;
	private Website website;
	private long lastChecked;
	private String lastContent;
	
	Subscription(String url, Frequency frequency, Channel channel){
		id = ++idCounter;
		this.frequency= frequency;
		this.channel = channel;
		this.lastChecked =System.currentTimeMillis();
		this.lastContent = "";
		this.website = new Website(url,"");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	 public long getLastChecked() { 
		 return lastChecked; 
	}

	public void updateLastChecked() {
	     this.lastChecked = System.currentTimeMillis();
	}
	
	public String getLastContent() {
		return lastContent;
	}
	
	public void updateLastContent(String content) {
		this.lastContent = content;
	}
	
	public Website getWebsite() {
		return website;
	}

}
