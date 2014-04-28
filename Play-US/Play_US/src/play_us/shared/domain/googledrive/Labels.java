
package play_us.shared.domain.googledrive;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Labels implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 5588599886876287343L;
	private boolean hidden;
   	private boolean restricted;
   	private boolean starred;
   	private boolean trashed;
   	private boolean viewed;

 	public boolean getHidden(){
		return this.hidden;
	}
	public void setHidden(boolean hidden){
		this.hidden = hidden;
	}
 	public boolean getRestricted(){
		return this.restricted;
	}
	public void setRestricted(boolean restricted){
		this.restricted = restricted;
	}
 	public boolean getStarred(){
		return this.starred;
	}
	public void setStarred(boolean starred){
		this.starred = starred;
	}
 	public boolean getTrashed(){
		return this.trashed;
	}
	public void setTrashed(boolean trashed){
		this.trashed = trashed;
	}
 	public boolean getViewed(){
		return this.viewed;
	}
	public void setViewed(boolean viewed){
		this.viewed = viewed;
	}
}
