package twitter.client.services;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TwitterAuthenticatedServiceAsync {

	public void inicioSesion(AsyncCallback<String> callback);		
	public void escribirTweet(String url, String mensaje, AsyncCallback<String> asyncCallback);
	void getTimeLineS(String url, Integer numTweets, AsyncCallback<List<String>> callback);
}
