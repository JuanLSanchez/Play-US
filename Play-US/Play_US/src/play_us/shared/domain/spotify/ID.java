
package play_us.shared.domain.spotify;

import java.io.Serializable;

public class ID implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 3720412132162185972L;
	private String id;
   	private String type;

 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
