package twitter.client.services;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("twitter")
public interface TwitterAuthenticatedService extends RemoteService{

	public String inicioSesion();		
	public String escribirTweet(String url, String mensaje);
	public List<String> getTimeLineS(String url, Integer numTweets);
	
}
