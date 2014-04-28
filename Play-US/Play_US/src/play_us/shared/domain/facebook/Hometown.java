
package play_us.shared.domain.facebook;

import java.io.Serializable;

public class Hometown implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = -764084113815603381L;
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
