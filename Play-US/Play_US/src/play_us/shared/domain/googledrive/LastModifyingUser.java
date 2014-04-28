
package play_us.shared.domain.googledrive;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class LastModifyingUser implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = -5474595193564602432L;
	private String displayName;
   	private boolean isAuthenticatedUser;
   	private String kind;
   	private String permissionId;

 	public String getDisplayName(){
		return this.displayName;
	}
	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}
 	public boolean getIsAuthenticatedUser(){
		return this.isAuthenticatedUser;
	}
	public void setIsAuthenticatedUser(boolean isAuthenticatedUser){
		this.isAuthenticatedUser = isAuthenticatedUser;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getPermissionId(){
		return this.permissionId;
	}
	public void setPermissionId(String permissionId){
		this.permissionId = permissionId;
	}
}
