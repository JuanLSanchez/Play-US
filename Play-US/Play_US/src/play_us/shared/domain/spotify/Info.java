
package play_us.shared.domain.spotify;

import java.io.Serializable;

public class Info implements Serializable{
   	/**
	 * 
	 */
	private static final long serialVersionUID = 3686657329285924828L;
	private Number limit;
   	private Number num_results;
   	private Number offset;
   	private Number page;
   	private String query;
   	private String type;

 	public Number getLimit(){
		return this.limit;
	}
	public void setLimit(Number limit){
		this.limit = limit;
	}
 	public Number getNum_results(){
		return this.num_results;
	}
	public void setNum_results(Number num_results){
		this.num_results = num_results;
	}
 	public Number getOffset(){
		return this.offset;
	}
	public void setOffset(Number offset){
		this.offset = offset;
	}
 	public Number getPage(){
		return this.page;
	}
	public void setPage(Number page){
		this.page = page;
	}
 	public String getQuery(){
		return this.query;
	}
	public void setQuery(String query){
		this.query = query;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
