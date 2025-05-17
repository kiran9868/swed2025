package fuas.swed2025.exercises;

/**
 * Website class with url and a Content
 * 
 * @author Kiran
 * @version 1.0
 * */

public class Website {
	
	private String url;
	private String content;
	
	public Website(String url,String content) {
		this.url = url;
		this.content = content;
		
	}
	
	public void setContent(String con) {
		content = con;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setUrl(String newUrl) {
		url = newUrl;
	}
	
	public String getUrl() {
		return url;
	}

}
