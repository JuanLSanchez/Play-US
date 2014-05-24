package twitter.shared.domain.twitter;

import java.io.Serializable;

public class TwitterUser implements Serializable{

	private static final long serialVersionUID = -955673957904054258L;
	
	private String userName;
	private String userID;

	public void setUserName(String name){
		this.userName = name;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserID(String id){
		this.userID = id;
	}
	
	public String getUserID(){
		return userID;
	}

}
