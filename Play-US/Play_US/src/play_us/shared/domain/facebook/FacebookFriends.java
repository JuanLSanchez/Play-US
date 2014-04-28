
package play_us.shared.domain.facebook;

import java.io.Serializable;
import java.util.List;

public class FacebookFriends implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 7615830497749499027L;
	private List<Data> data;
   	private Paging paging;

 	public List<Data> getData(){
		return this.data;
	}
	public void setData(List<Data> data){
		this.data = data;
	}
 	public Paging getPaging(){
		return this.paging;
	}
	public void setPaging(Paging paging){
		this.paging = paging;
	}
}
