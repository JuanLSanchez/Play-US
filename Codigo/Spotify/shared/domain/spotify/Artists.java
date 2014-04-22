
package aiss.shared.domain.spotify;

import java.io.Serializable;
import java.util.List;

public class Artists implements Serializable{
   	private String href;
   	private String name;

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
}
