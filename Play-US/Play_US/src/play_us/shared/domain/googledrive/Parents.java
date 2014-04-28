
package play_us.shared.domain.googledrive;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Parents implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 6773030417079390365L;
	private String id;
   	private boolean isRoot;
   	private String kind;
   	private String parentLink;
   	private String selfLink;

 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public boolean getIsRoot(){
		return this.isRoot;
	}
	public void setIsRoot(boolean isRoot){
		this.isRoot = isRoot;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getParentLink(){
		return this.parentLink;
	}
	public void setParentLink(String parentLink){
		this.parentLink = parentLink;
	}
 	public String getSelfLink(){
		return this.selfLink;
	}
	public void setSelfLink(String selfLink){
		this.selfLink = selfLink;
	}
}
