
package play_us.shared.domain.googledrive;


import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserPermission implements Serializable {
	private static final long serialVersionUID = 266503418391032235L;
   	private String etag;
   	private String id;
   	private String kind;
   	private String role;
   	private String selfLink;
   	private String type;

 	public String getEtag(){
		return this.etag;
	}
	public void setEtag(String etag){
		this.etag = etag;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getRole(){
		return this.role;
	}
	public void setRole(String role){
		this.role = role;
	}
 	public String getSelfLink(){
		return this.selfLink;
	}
	public void setSelfLink(String selfLink){
		this.selfLink = selfLink;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
