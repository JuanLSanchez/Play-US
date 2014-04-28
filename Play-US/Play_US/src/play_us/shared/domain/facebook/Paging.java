
package play_us.shared.domain.facebook;

import java.io.Serializable;

public class Paging implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = -7307874555330985480L;
	private String next;

 	public String getNext(){
		return this.next;
	}
	public void setNext(String next){
		this.next = next;
	}
}
