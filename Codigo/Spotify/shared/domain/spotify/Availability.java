
package aiss.shared.domain.spotify;

import java.io.Serializable;
import java.util.List;

public class Availability implements Serializable{
   	private String territories;

 	public String getTerritories(){
		return this.territories;
	}
	public void setTerritories(String territories){
		this.territories = territories;
	}
}
