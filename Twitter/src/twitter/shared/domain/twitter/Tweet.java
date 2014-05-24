package twitter.shared.domain.twitter;

import java.io.Serializable;

public class Tweet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5068237646466458451L;
	private Long id;
	private Integer retweets;
	private Integer favorites;
	private String message;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRetweets() {
		return retweets;
	}
	public void setRetweets(Integer retweets) {
		this.retweets = retweets;
	}
	public Integer getFavorites() {
		return favorites;
	}
	public void setFavorites(Integer favorites) {
		this.favorites = favorites;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
