
package play_us.shared.domain.facebook;

import java.io.Serializable;

public class Education implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 3090416535556409708L;
	private School school;
   	private String type;

 	public School getSchool(){
		return this.school;
	}
	public void setSchool(School school){
		this.school = school;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
