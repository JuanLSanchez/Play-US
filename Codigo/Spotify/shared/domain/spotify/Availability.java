
package aiss.shared.domain.spotify;

import java.io.Serializable;

public class Availability implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String territories;

 	public String getTerritories(){
		return this.territories;
	}
	public void setTerritories(String territories){
		this.territories = territories;
	}
}
