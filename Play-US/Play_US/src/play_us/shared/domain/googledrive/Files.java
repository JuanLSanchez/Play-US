
package play_us.shared.domain.googledrive;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Files implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 8086256074288937098L;
	private String etag;
   	private List<FileItem> items;
   	private String kind;
   	private String selfLink;

 	public String getEtag(){
		return this.etag;
	}
	public void setEtag(String etag){
		this.etag = etag;
	}
 	public List<FileItem> getItems(){
		return this.items;
	}
	public void setItems(List<FileItem> items){
		this.items = items;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getSelfLink(){
		return this.selfLink;
	}
	public void setSelfLink(String selfLink){
		this.selfLink = selfLink;
	}
}
