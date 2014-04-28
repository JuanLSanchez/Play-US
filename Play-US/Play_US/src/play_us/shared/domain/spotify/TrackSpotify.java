
package play_us.shared.domain.spotify;

import java.io.Serializable;
import java.util.List;

public class TrackSpotify implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = -8521237125661912810L;
	private Info info;
   	private List<Tracks> tracks;

 	public Info getInfo(){
		return this.info;
	}
	public void setInfo(Info info){
		this.info = info;
	}
 	public List<Tracks> getTracks(){
		return this.tracks;
	}
	public void setTracks(List<Tracks> tracks){
		this.tracks = tracks;
	}
}
