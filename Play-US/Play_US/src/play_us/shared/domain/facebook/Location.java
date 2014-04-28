
package play_us.shared.domain.facebook;

import java.io.Serializable;

public class Location implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = -4250314211414693677L;
	private String id;
   	private String name;

 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
