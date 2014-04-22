
package aiss.shared.domain.spotify;

import java.io.Serializable;
import java.util.List;

public class Tracks implements Serializable{
   	private Album album;
   	private List<Artists> artists;
   	private List<ID> ID;
   	private String href;
   	private Number length;
   	private String name;
   	private String popularity;
   	private String trackNumber;

 	public Album getAlbum(){
		return this.album;
	}
	public void setAlbum(Album album){
		this.album = album;
	}
 	public List<Artists> getArtists(){
		return this.artists;
	}
	public void setArtists(List<Artists> artists){
		this.artists = artists;
	}
 	public List<ID> getExternalIds(){
		return this.ID;
	}
	public void setID(List<ID> ID){
		this.ID=ID;
	}
 	public String getHref(){
		return this.href;
	}
	public void setHref(String href){
		this.href = href;
	}
 	public Number getLength(){
		return this.length;
	}
	public void setLength(Number length){
		this.length = length;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getPopularity(){
		return this.popularity;
	}
	public void setPopularity(String popularity){
		this.popularity = popularity;
	}
 	public String getTrackNumber(){
		return this.trackNumber;
	}
	public void setTrackNumber(String trackNumber){
		this.trackNumber = trackNumber;
	}
}
