package play_us.client.rpc;

import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GroovesharkAsync {

	void getSongSearchResults(String query, Integer limit, Integer offset, GetCountry country,
			AsyncCallback<GetSongSearchResults> callback);

	void getCountry(String ip, AsyncCallback<GetCountry> callback);

	void getIDSesion(AsyncCallback<String> callback);

	void getURLStreaming(String songID, GetCountry country, String sesionID,
			AsyncCallback<String> callback);

	void getCountry(AsyncCallback<GetCountry> callback);

}
