
package aiss.shared.domain.spotify;

import java.io.Serializable;

public class Album implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Availability availability;
   	private String href;
   	private String name;
   	private String released;

 	public Availability getAvailability(){
		return this.availability;
	}
	public void setAvailability(Availability availability){
		this.availability = availability;
	}
 	public String getHref(){
		return this.href;
	}
	public void setHref(String href){
		this.href = href;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getReleased(){
		return this.released;
	}
	public void setReleased(String released){
		this.released = released;
	}
}
