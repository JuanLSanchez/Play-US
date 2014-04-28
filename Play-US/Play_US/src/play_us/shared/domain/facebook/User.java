
package play_us.shared.domain.facebook;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 3533558921493532371L;
	private List education;
   	private String first_name;
   	private String gender;
   	private Hometown hometown;
   	private String id;
   	private String last_name;
   	private String link;
   	private String locale;
   	private Location location;
   	private String name;
   	private Number timezone;
   	private String updated_time;
   	private String username;
   	private boolean verified;

 	public List getEducation(){
		return this.education;
	}
	public void setEducation(List education){
		this.education = education;
	}
 	public String getFirst_name(){
		return this.first_name;
	}
	public void setFirst_name(String first_name){
		this.first_name = first_name;
	}
 	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
 	public Hometown getHometown(){
		return this.hometown;
	}
	public void setHometown(Hometown hometown){
		this.hometown = hometown;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getLast_name(){
		return this.last_name;
	}
	public void setLast_name(String last_name){
		this.last_name = last_name;
	}
 	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}
 	public String getLocale(){
		return this.locale;
	}
	public void setLocale(String locale){
		this.locale = locale;
	}
 	public Location getLocation(){
		return this.location;
	}
	public void setLocation(Location location){
		this.location = location;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public Number getTimezone(){
		return this.timezone;
	}
	public void setTimezone(Number timezone){
		this.timezone = timezone;
	}
 	public String getUpdated_time(){
		return this.updated_time;
	}
	public void setUpdated_time(String updated_time){
		this.updated_time = updated_time;
	}
 	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
 	public boolean getVerified(){
		return this.verified;
	}
	public void setVerified(boolean verified){
		this.verified = verified;
	}
}
