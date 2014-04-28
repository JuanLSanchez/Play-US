
package play_us.shared.domain.spotify;

import java.io.Serializable;

public class Artists implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 7271694354981138951L;
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
