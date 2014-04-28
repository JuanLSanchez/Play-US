package play_us.client.rpc;

import java.util.List;

import play_us.shared.domain.Track;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SoundcloudAsync {

	void getTitulos(String filter, Integer pagina, Integer canciones,
			AsyncCallback<List<String>> callback);

	void getTracks(String filter, Integer pagina, Integer canciones,
			AsyncCallback<List<Track>> callback);

}
