
package play_us.shared.domain;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class User implements Serializable{
	private static final long serialVersionUID = 1301373113706564633L;
	
   	private String avatar_url;
   	private Number id;
   	private String kind;
   	private String permalink;
   	private String permalink_url;
   	private String uri;
   	private String username;

 	public String getAvatar_url(){
		return this.avatar_url;
	}
	public void setAvatar_url(String avatar_url){
		this.avatar_url = avatar_url;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getPermalink(){
		return this.permalink;
	}
	public void setPermalink(String permalink){
		this.permalink = permalink;
	}
 	public String getPermalink_url(){
		return this.permalink_url;
	}
	public void setPermalink_url(String permalink_url){
		this.permalink_url = permalink_url;
	}
 	public String getUri(){
		return this.uri;
	}
	public void setUri(String uri){
		this.uri = uri;
	}
 	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
}
