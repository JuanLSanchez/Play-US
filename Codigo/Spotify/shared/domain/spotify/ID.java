
package aiss.shared.domain.spotify;

import java.io.Serializable;


public class ID implements Serializable{
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
